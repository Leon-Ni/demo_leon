package entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import entity.annotation.ColumnAlias;
import org.hibernate.annotations.Nationalized;


@Entity
@Table(name = "TAXIC_OI_DOC", indexes = {
		@javax.persistence.Index(columnList = "ID", name = "IDX_TAXIC_OI_DOC", unique = true),
		@javax.persistence.Index(columnList = "fapdm,faphm", name = "IDX_TAXIC_OI_DOC_fapdmhm")})
public class Doc extends EntityDeepCopy
{
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false, precision = 20, scale = 0)
	private long id;
	@OneToMany(cascade = { javax.persistence.CascadeType.REMOVE }, fetch = FetchType.LAZY, mappedBy = "doc")
	private List<DocDetail> docDetails;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "kddID", nullable = true)
	//private KDD kdd;
	@ColumnAlias("单据号")
	@Column(name = "danjh", length = 60, nullable = false)
	private String danjh;
	@ColumnAlias("单据日期")
	@Column(name = "djrq", length = 8, nullable = true)
	private String djrq;
	@ColumnAlias("原单据号")
	@Column(name = "ydanjh", length = 60, nullable = true)
	private String ydanjh;
	@ColumnAlias("申请人")
	@Nationalized
	@Column(name = "sqr", length = 25, nullable = true)
	private String sqr;
	@ColumnAlias("申请人邮件")
	@Column(name = "sqryj", length = 50, nullable = true)
	private String sqryj;
	@ColumnAlias("申请人电话")
	@Column(name = "sqrdh", length = 20, nullable = true)
	private String sqrdh;
	@ColumnAlias("企业编号")
	@Column(name = "qiybh", length = 40, nullable = false)
	private String qiybh;
	@ColumnAlias("发票状态")
	@Column(name = "fpzt", length = 2, nullable = false)
	private String fpzt;
	@ColumnAlias("纸质发票打印状态")
	@Column(name = "fapdyzt", length = 1, nullable = true)
	private String fapdyzt;
	@ColumnAlias("含税方式")
	@Column(name = "hansfs", length = 1, nullable = true)
	private String hansfs = "0";
	@ColumnAlias("发票来源")
	@Column(name = "fply", length = 1, nullable = true)
	private String fply;
	@ColumnAlias("开票失败原因")
	@Nationalized
	@Column(name = "fapsbyy", length = 200, nullable = true)
	private String fapsbyy;
	@ColumnAlias("回传状态")
	@Column(name = "hczt", length = 2, nullable = false)
	private String hczt;
	@ColumnAlias("购方识别号")
	@Column(name = "goufsbh", length = 25, nullable = true)
	private String goufsbh;
	@ColumnAlias("购方代码")
	@Nationalized
	@Column(name = "goufdm", length = 50, nullable = true)
	private String goufdm;
	@ColumnAlias("购方名称")
	@Nationalized
	@Column(name = "goufmc", length = 100, nullable = true)
	private String goufmc;
	@ColumnAlias("购方英文名称")
	@Column(name = "goufywmc", length = 100, nullable = true)
	private String goufywmc;
	@ColumnAlias("发票代码")
	@Column(name = "fapdm", length = 15, nullable = true)
	private String fapdm;
	@ColumnAlias("发票号码")
	@Column(name = "faphm", length = 10, nullable = true)
	private String faphm;
	@ColumnAlias("原发票代码")
	@Column(name = "yfapdm", length = 15, nullable = true)
	private String yfapdm;
	@ColumnAlias("原发票号码")
	@Column(name = "yfaphm", length = 10, nullable = true)
	private String yfaphm;
	@ColumnAlias("原开票日期")
	@Column(name = "ykaiprq", length = 20, nullable = true)
	private String ykaiprq;
	@ColumnAlias("金额")
	@Column(name = "jine", precision = 20, scale = 2, nullable = true)
	private BigDecimal jine = new BigDecimal(0);
	@ColumnAlias("税额")
	@Column(name = "shuie", precision = 20, scale = 2, nullable = true)
	private BigDecimal shuie = new BigDecimal(0);
	@ColumnAlias("价税合计")
	@Column(name = "jiashj", precision = 20, scale = 2, nullable = true)
	private BigDecimal jiashj = new BigDecimal(0);
	@ColumnAlias("实开金额")
	@Column(name = "shikje", precision = 20, scale = 2, nullable = true)
	private BigDecimal shikje = new BigDecimal(0);
	@ColumnAlias("实开税额")
	@Column(name = "shikse", precision = 20, scale = 2, nullable = true)
	private BigDecimal shikse = new BigDecimal(0);
	@ColumnAlias("实开价税合计")
	@Column(name = "shikjshj", precision = 20, scale = 2, nullable = true)
	private BigDecimal shikjshj = new BigDecimal(0);
	@ColumnAlias("创建日期")
	@Column(name = "cjrq", length = 20, nullable = true)
	private String cjrq;
	@ColumnAlias("开票时间")
	@Column(name = "kaiprq", length = 20, nullable = true)
	private String kaiprq;
	@ColumnAlias("销方识别号")
	@Column(name = "xiaofsbh", length = 20, nullable = true)
	private String xiaofsbh;
	@ColumnAlias("销方名称")
	@Nationalized
	@Column(name = "xiaofmc", length = 100, nullable = true)
	private String xiaofmc;
	@ColumnAlias("税率")
	@Column(name = "shuil", length = 5, nullable = true)
	private String shuil = "0";
	@ColumnAlias("是否有清单")
	@Column(name = "qingd", length = 1, nullable = true)
	private String qingd;
	@ColumnAlias("购方地址")
	@Nationalized
	@Column(name = "goufdz", length = 150, nullable = true)
	private String goufdz;
	@ColumnAlias("购方银行")
	@Nationalized
	@Column(name = "goufyh", length = 150, nullable = true)
	private String goufyh;
	@ColumnAlias("销方地址")
	@Nationalized
	@Column(name = "xiaofdz", length = 150, nullable = true)
	private String xiaofdz;
	@ColumnAlias("销方银行")
	@Nationalized
	@Column(name = "xiaofyh", length = 150, nullable = true)
	private String xiaofyh;
	@ColumnAlias("发票类型")
	@Column(name = "faplx", length = 3, nullable = true)
	private String faplx;
	@ColumnAlias("是否负数发票")
	@Column(name = "fusfp", length = 2, nullable = true)
	private String fusfp = "0";
	@ColumnAlias("红冲申请单号")
	@Column(name = "hcsqdh", length = 30, nullable = true)
	private String hcsqdh;
	@ColumnAlias("收款人")
	@Nationalized
	@Column(name = "shoukr", length = 20, nullable = true)
	private String shoukr;
	@ColumnAlias("复核人")
	@Nationalized
	@Column(name = "fuhr", length = 20, nullable = true)
	private String fuhr;
	@ColumnAlias("开票人")
	@Nationalized
	@Column(name = "kaipr", length = 20, nullable = true)
	private String kaipr;
	@ColumnAlias("作废人")
	@Nationalized
	@Column(name = "zuofr", length = 20, nullable = true)
	private String zuofr;
	@ColumnAlias("作废时间")
	@Nationalized
	@Column(name = "zuofrq", length = 20, nullable = true)
	private String zuofrq;
	@ColumnAlias("备注字段")
	@Nationalized
	@Column(name = "beiz", length = 300, nullable = true)
	private String beiz;
	@ColumnAlias("机器编号")
	@Nationalized
	@Column(name = "jiqbh", length = 20, nullable = true)
	private String jiqbh;
	@ColumnAlias("开票机编号")
	@Nationalized
	@Column(name = "kaipjbh", length = 20, nullable = true)
	private String kaipjbh;
	@ColumnAlias("密文1")
	@Column(name = "miw1", length = 200, nullable = true)
	private String miw1;
	@ColumnAlias("密文2")
	@Column(name = "miw2", length = 200, nullable = true)
	private String miw2;
	@ColumnAlias("密文3")
	@Column(name = "miw3", length = 200, nullable = true)
	private String miw3;
	@ColumnAlias("密文4")
	@Column(name = "miw4", length = 200, nullable = true)
	private String miw4;
	@ColumnAlias("税控编号")
	@Column(name = "shuikbh", length = 20, nullable = true)
	private String shuikbh;
	@ColumnAlias("二维码")
	@Column(name = "ewm", length = 2000, nullable = true)
	private String ewm;
	@ColumnAlias("效验码")
	@Column(name = "xiaoym", length = 40, nullable = true)
	private String xiaoym;
	@ColumnAlias("开票返回编码")
	@Column(name = "kaipfhbm", length = 40, nullable = true)
	private String kaipfhbm;
	@ColumnAlias("开票返回消息")
	@Nationalized
	@Column(name = "kaipfhxx", length = 150, nullable = true)
	private String kaipfhxx;
	@ColumnAlias("快递批次号")
	@Column(name = "kdpch", length = 40, nullable = true)
	private String kdpch;
	@ColumnAlias("快递联系人编号")
	@Column(name = "kdlxrbh", length = 2, nullable = true)
	private String kdlxrbh;
	@ColumnAlias("快递公司")
	@Column(name = "kdgs", length = 1, nullable = true)
	private String kdgs;
	@ColumnAlias("直接开票")
	@Column(name = "zjkp", length = 1, nullable = true)
	private String zjkp = "0";
	@ColumnAlias("报送状态")
	@Column(name = "bszt", length = 1, nullable = true)
	private String bszt = "0";
	@ColumnAlias("pdf状态")
	@Column(name = "pdfzt", length = 1, nullable = true)
	private String pdfzt = "0";
	@ColumnAlias("邮件状态")
	@Column(name = "emailzt", length = 1, nullable = true)
	private String emailzt = "0";
	@ColumnAlias("报送日期")
	@Column(name = "bsrq", length = 15, nullable = true)
	private String bsrq;
	@ColumnAlias("报送日志")
	@Nationalized
	@Column(name = "bsrz", length = 50, nullable = true)
	private String bsrz;
	@ColumnAlias("表EMSWGQ的id")
	@Nationalized
	@Column(name = "emsid", length = 50, nullable = true)
	private String emsid;
	@ColumnAlias("参考字段1")
	@Nationalized
	@Column(name = "cank1", length = 50, nullable = true)
	private String cank1;
	@ColumnAlias("参考字段2")
	@Nationalized
	@Column(name = "cank2", length = 50, nullable = true)
	private String cank2;
	@ColumnAlias("参考字段3")
	@Nationalized
	@Column(name = "cank3", length = 50, nullable = true)
	private String cank3;
	@ColumnAlias("参考字段4")
	@Nationalized
	@Column(name = "cank4", length = 50, nullable = true)
	private String cank4;
	@ColumnAlias("参考字段5")
	@Nationalized
	@Column(name = "cank5", length = 50, nullable = true)
	private String cank5;
	@ColumnAlias("参考字段6")
	@Nationalized
	@Column(name = "cank6", length = 50, nullable = true)
	private String cank6;
	@ColumnAlias("参考字段7")
	@Nationalized
	@Column(name = "cank7", length = 50, nullable = true)
	private String cank7;
	@ColumnAlias("参考字段8")
	@Nationalized
	@Column(name = "cank8", length = 50, nullable = true)
	private String cank8;
	@ColumnAlias("参考字段9")
	@Nationalized
	@Column(name = "cank9", length = 50, nullable = true)
	private String cank9;
	@ColumnAlias("参考字段10")
	@Nationalized
	@Column(name = "cank10", length = 50, nullable = true)
	private String cank10;
	@ColumnAlias("参考字段11")
	@Nationalized
	@Column(name = "cank11", length = 50, nullable = true)
	private String cank11;
	@ColumnAlias("参考字段12")
	@Nationalized
	@Column(name = "cank12", length = 50, nullable = true)
	private String cank12;
	@ColumnAlias("参考字段13")
	@Nationalized
	@Column(name = "cank13", length = 50, nullable = true)
	private String cank13;
	@ColumnAlias("参考字段14")
	@Nationalized
	@Column(name = "cank14", length = 50, nullable = true)
	private String cank14;
	@ColumnAlias("参考字段15")
	@Nationalized
	@Column(name = "cank15", length = 50, nullable = true)
	private String cank15;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<DocDetail> getDocDetails() {
		return docDetails;
	}
	public void setDocDetails(List<DocDetail> docDetails) {
		this.docDetails = docDetails;
	}
	//public KDD getKdd() {
	//	return kdd;
	//}
	//public void setKdd(KDD kdd) {
	//	this.kdd = kdd;
	//}
	public String getDanjh() {
		return danjh;
	}
	public void setDanjh(String danjh) {
		this.danjh = danjh;
	}
	public String getDjrq() {
		return djrq;
	}
	public void setDjrq(String djrq) {
		this.djrq = djrq;
	}
	public String getYdanjh() {
		return ydanjh;
	}
	public void setYdanjh(String ydanjh) {
		this.ydanjh = ydanjh;
	}
	public String getSqr() {
		return sqr;
	}
	public void setSqr(String sqr) {
		this.sqr = sqr;
	}
	public String getSqryj() {
		return sqryj;
	}
	public void setSqryj(String sqryj) {
		this.sqryj = sqryj;
	}
	public String getSqrdh() {
		return sqrdh;
	}
	public void setSqrdh(String sqrdh) {
		this.sqrdh = sqrdh;
	}
	public String getQiybh() {
		return qiybh;
	}
	public void setQiybh(String qiybh) {
		this.qiybh = qiybh;
	}
	public String getFpzt() {
		return fpzt;
	}
	public void setFpzt(String fpzt) {
		this.fpzt = fpzt;
	}
	public String getFapdyzt() {
		return fapdyzt;
	}
	public void setFapdyzt(String fapdyzt) {
		this.fapdyzt = fapdyzt;
	}
	public String getHansfs() {
		return hansfs;
	}
	public void setHansfs(String hansfs) {
		this.hansfs = hansfs;
	}
	public String getFply() {
		return fply;
	}
	public void setFply(String fply) {
		this.fply = fply;
	}
	public String getFapsbyy() {
		return fapsbyy;
	}
	public void setFapsbyy(String fapsbyy) {
		this.fapsbyy = fapsbyy;
	}
	public String getHczt() {
		return hczt;
	}
	public void setHczt(String hczt) {
		this.hczt = hczt;
	}
	public String getGoufsbh() {
		return goufsbh;
	}
	public void setGoufsbh(String goufsbh) {
		this.goufsbh = goufsbh;
	}
	public String getGoufdm() {
		return goufdm;
	}
	public void setGoufdm(String goufdm) {
		this.goufdm = goufdm;
	}
	public String getGoufmc() {
		return goufmc;
	}
	public void setGoufmc(String goufmc) {
		this.goufmc = goufmc;
	}
	public String getGoufywmc() {
		return goufywmc;
	}
	public void setGoufywmc(String goufywmc) {
		this.goufywmc = goufywmc;
	}
	public String getFapdm() {
		return fapdm;
	}
	public void setFapdm(String fapdm) {
		this.fapdm = fapdm;
	}
	public String getFaphm() {
		return faphm;
	}
	public void setFaphm(String faphm) {
		this.faphm = faphm;
	}
	public String getYfapdm() {
		return yfapdm;
	}
	public void setYfapdm(String yfapdm) {
		this.yfapdm = yfapdm;
	}
	public String getYfaphm() {
		return yfaphm;
	}
	public void setYfaphm(String yfaphm) {
		this.yfaphm = yfaphm;
	}
	public String getYkaiprq() {
		return ykaiprq;
	}
	public void setYkaiprq(String ykaiprq) {
		this.ykaiprq = ykaiprq;
	}
	public BigDecimal getJine() {
		return jine;
	}
	public void setJine(BigDecimal jine) {
		this.jine = jine;
	}
	public BigDecimal getShuie() {
		return shuie;
	}
	public void setShuie(BigDecimal shuie) {
		this.shuie = shuie;
	}
	public BigDecimal getJiashj() {
		return jiashj;
	}
	public void setJiashj(BigDecimal jiashj) {
		this.jiashj = jiashj;
	}
	public BigDecimal getShikje() {
		return shikje;
	}
	public void setShikje(BigDecimal shikje) {
		this.shikje = shikje;
	}
	public BigDecimal getShikse() {
		return shikse;
	}
	public void setShikse(BigDecimal shikse) {
		this.shikse = shikse;
	}
	public BigDecimal getShikjshj() {
		return shikjshj;
	}
	public void setShikjshj(BigDecimal shikjshj) {
		this.shikjshj = shikjshj;
	}
	public String getCjrq() {
		return cjrq;
	}
	public void setCjrq(String cjrq) {
		this.cjrq = cjrq;
	}
	public String getKaiprq() {
		return kaiprq;
	}
	public void setKaiprq(String kaiprq) {
		this.kaiprq = kaiprq;
	}
	public String getXiaofsbh() {
		return xiaofsbh;
	}
	public void setXiaofsbh(String xiaofsbh) {
		this.xiaofsbh = xiaofsbh;
	}
	public String getXiaofmc() {
		return xiaofmc;
	}
	public void setXiaofmc(String xiaofmc) {
		this.xiaofmc = xiaofmc;
	}
	public String getShuil() {
		return shuil;
	}
	public void setShuil(String shuil) {
		this.shuil = shuil;
	}
	public String getQingd() {
		return qingd;
	}
	public void setQingd(String qingd) {
		this.qingd = qingd;
	}
	public String getGoufdz() {
		return goufdz;
	}
	public void setGoufdz(String goufdz) {
		this.goufdz = goufdz;
	}
	public String getGoufyh() {
		return goufyh;
	}
	public void setGoufyh(String goufyh) {
		this.goufyh = goufyh;
	}
	public String getXiaofdz() {
		return xiaofdz;
	}
	public void setXiaofdz(String xiaofdz) {
		this.xiaofdz = xiaofdz;
	}
	public String getXiaofyh() {
		return xiaofyh;
	}
	public void setXiaofyh(String xiaofyh) {
		this.xiaofyh = xiaofyh;
	}
	public String getFaplx() {
		return faplx;
	}
	public void setFaplx(String faplx) {
		this.faplx = faplx;
	}
	public String getFusfp() {
		return fusfp;
	}
	public void setFusfp(String fusfp) {
		this.fusfp = fusfp;
	}
	public String getHcsqdh() {
		return hcsqdh;
	}
	public void setHcsqdh(String hcsqdh) {
		this.hcsqdh = hcsqdh;
	}
	public String getShoukr() {
		return shoukr;
	}
	public void setShoukr(String shoukr) {
		this.shoukr = shoukr;
	}
	public String getFuhr() {
		return fuhr;
	}
	public void setFuhr(String fuhr) {
		this.fuhr = fuhr;
	}
	public String getKaipr() {
		return kaipr;
	}
	public void setKaipr(String kaipr) {
		this.kaipr = kaipr;
	}
	public String getZuofr() {
		return zuofr;
	}
	public void setZuofr(String zuofr) {
		this.zuofr = zuofr;
	}
	public String getZuofrq() {
		return zuofrq;
	}
	public void setZuofrq(String zuofrq) {
		this.zuofrq = zuofrq;
	}
	public String getBeiz() {
		return beiz;
	}
	public void setBeiz(String beiz) {
		this.beiz = beiz;
	}
	public String getJiqbh() {
		return jiqbh;
	}
	public void setJiqbh(String jiqbh) {
		this.jiqbh = jiqbh;
	}
	public String getKaipjbh() {
		return kaipjbh;
	}
	public void setKaipjbh(String kaipjbh) {
		this.kaipjbh = kaipjbh;
	}
	public String getMiw1() {
		return miw1;
	}
	public void setMiw1(String miw1) {
		this.miw1 = miw1;
	}
	public String getMiw2() {
		return miw2;
	}
	public void setMiw2(String miw2) {
		this.miw2 = miw2;
	}
	public String getMiw3() {
		return miw3;
	}
	public void setMiw3(String miw3) {
		this.miw3 = miw3;
	}
	public String getMiw4() {
		return miw4;
	}
	public void setMiw4(String miw4) {
		this.miw4 = miw4;
	}
	public String getShuikbh() {
		return shuikbh;
	}
	public void setShuikbh(String shuikbh) {
		this.shuikbh = shuikbh;
	}
	public String getEwm() {
		return ewm;
	}
	public void setEwm(String ewm) {
		this.ewm = ewm;
	}
	public String getXiaoym() {
		return xiaoym;
	}
	public void setXiaoym(String xiaoym) {
		this.xiaoym = xiaoym;
	}
	public String getKaipfhbm() {
		return kaipfhbm;
	}
	public void setKaipfhbm(String kaipfhbm) {
		this.kaipfhbm = kaipfhbm;
	}
	public String getKaipfhxx() {
		return kaipfhxx;
	}
	public void setKaipfhxx(String kaipfhxx) {
		this.kaipfhxx = kaipfhxx;
	}
	public String getKdpch() {
		return kdpch;
	}
	public void setKdpch(String kdpch) {
		this.kdpch = kdpch;
	}
	public String getKdlxrbh() {
		return kdlxrbh;
	}
	public void setKdlxrbh(String kdlxrbh) {
		this.kdlxrbh = kdlxrbh;
	}
	public String getKdgs() {
		return kdgs;
	}
	public void setKdgs(String kdgs) {
		this.kdgs = kdgs;
	}
	public String getZjkp() {
		return zjkp;
	}
	public void setZjkp(String zjkp) {
		this.zjkp = zjkp;
	}
	public String getBszt() {
		return bszt;
	}
	public void setBszt(String bszt) {
		this.bszt = bszt;
	}
	public String getPdfzt() {
		return pdfzt;
	}
	public void setPdfzt(String pdfzt) {
		this.pdfzt = pdfzt;
	}
	public String getEmailzt() {
		return emailzt;
	}
	public void setEmailzt(String emailzt) {
		this.emailzt = emailzt;
	}
	public String getBsrq() {
		return bsrq;
	}
	public void setBsrq(String bsrq) {
		this.bsrq = bsrq;
	}
	public String getBsrz() {
		return bsrz;
	}
	public void setBsrz(String bsrz) {
		this.bsrz = bsrz;
	}
	public String getEmsid() {
		return emsid;
	}
	public void setEmsid(String emsid) {
		this.emsid = emsid;
	}

	public String getCank1() {
		return cank1;
	}

	public void setCank1(String cank1) {
		this.cank1 = cank1;
	}
	public String getCank2() {
		return cank2;
	}
	public void setCank2(String cank2) {
		this.cank2 = cank2;
	}
	public String getCank3() {
		return cank3;
	}
	public void setCank3(String cank3) {
		this.cank3 = cank3;
	}
	public String getCank4() {
		return cank4;
	}
	public void setCank4(String cank4) {
		this.cank4 = cank4;
	}
	public String getCank5() {
		return cank5;
	}
	public void setCank5(String cank5) {
		this.cank5 = cank5;
	}
	public String getCank6() {
		return cank6;
	}
	public void setCank6(String cank6) {
		this.cank6 = cank6;
	}
	public String getCank7() {
		return cank7;
	}
	public void setCank7(String cank7) {
		this.cank7 = cank7;
	}
	public String getCank8() {
		return cank8;
	}
	public void setCank8(String cank8) {
		this.cank8 = cank8;
	}
	public String getCank9() {
		return cank9;
	}
	public void setCank9(String cank9) {
		this.cank9 = cank9;
	}
	public String getCank10() {
		return cank10;
	}
	public void setCank10(String cank10) {
		this.cank10 = cank10;
	}
	public String getCank11() {
		return cank11;
	}
	public void setCank11(String cank11) {
		this.cank11 = cank11;
	}
	public String getCank12() {
		return cank12;
	}
	public void setCank12(String cank12) {
		this.cank12 = cank12;
	}
	public String getCank13() {
		return cank13;
	}
	public void setCank13(String cank13) {
		this.cank13 = cank13;
	}
	public String getCank14() {
		return cank14;
	}
	public void setCank14(String cank14) {
		this.cank14 = cank14;
	}
	public String getCank15() {
		return cank15;
	}
	public void setCank15(String cank15) {
		this.cank15 = cank15;
	}
 
}
