package util;

import java.util.HashSet;
import java.util.List;

public class ExtraUtil {

	/**
	 * List去重
	 * @param list
	 * @return
	 */
	public static List removeDuplicate(List list) {   
		HashSet h = new HashSet(list);   
		list.clear();   
		list.addAll(h);   
		return list;   
	}   
}
