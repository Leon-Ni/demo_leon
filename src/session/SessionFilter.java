package session;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class SessionFilter implements Filter {

	private static Logger log = getLogger(SessionFilter.class);

	private ArrayList<String> allowList = new ArrayList<String>();

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		if (inAllowList(request.getRequestURL().toString(), request.getContextPath())) {
			filterChain.doFilter(request, response);
		} else {
			Object sysUserIdObj = request.getSession().getAttribute("当前的session");
			if (sysUserIdObj == null) {
				log.debug("*****会话超时*****" + request.getRequestURL());
				boolean ajax = "XMLHttpRequest".equals(request.getHeader("X-Requested-With"));
				if (ajax) {
					response.setStatus(440);
					response.setHeader("sessionstatus", "timeout");
				} else {
					// response.setCharacterEncoding("UTF-8");
					// response.getWriter()
					// .write("<HTML><meta charset=\"UTF-8\">会话超时，请<a
					// style='color:#0A57FF;text-decoration:underline;cursor:pointer'
					// onclick=\"window.location.href='"
					// + request.getContextPath() +
					// "/base/sys/login'\">重新登录</a></HTML>");
					response.sendRedirect(request.getContextPath() + "/base/sys/login");
				}
				return;
			} else {
				filterChain.doFilter(request, response);
			}
		}

	}

	private boolean inAllowList(String url, String contextPath) {
		for (String str : allowList) {

			if (!StringUtils.isEmpty(contextPath)) {
				if (url.endsWith(contextPath) || url.endsWith(contextPath + "/")) {
					return true;
				}
				if (url.indexOf(str) != -1) {
					return true;
				}
			} else {
				if (url.equalsIgnoreCase(contextPath) || url.equalsIgnoreCase(contextPath + "/")) {
					return true;
				}
				if (url.indexOf(str) != -1) {
					return true;
				}
			}

		}
		return false;
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		allowList.add("/index.html");
		allowList.add("/favicon.ico");
		allowList.add("base/sys/verifyCode");
		allowList.add("base/sys/stxx/get");
		allowList.add("/img/");
		allowList.add("/js/");
		allowList.add("/lib/");
		allowList.add("/css/");
		allowList.add("/sys/login");
		allowList.add("/sys/user/loginout");
		allowList.add("/sys/user/login");
		allowList.add("/sys/user/get/usersts");
		allowList.add("/sys/user/get/data");
		allowList.add("/fapxxOperation/");
		allowList.add("/ws/");
		allowList.add("/rest/");
		allowList.add("/stateless/");
		allowList.add("inputinv/supplyCenter/uploadDat");
		allowList.add("/servlet/UploadFP");
		allowList.add("/inv_veri/");
		allowList.add("/inputinv/invVeri/");
		allowList.add("/restless/iinv/");
		allowList.add("base/home/");
		allowList.add("/restless/oinv/");
		allowList.add("/oinv/stateless");
		allowList.add("/outputinv/stateless");
		allowList.add("/inputinv/stateless");
	
		allowList.add("/inputinv/fpcontent/display/sqdimage/");
		allowList.add("/inputinv/filedisplay/open");
		
		allowList.add("base/einv/submit/query");
		allowList.add("/drawee_query/drawee_query.html");
		// 增加EMS路径
		allowList.add("/msgtransfer/oinv");
	}

	@Override
	public void destroy() {
	}

}
