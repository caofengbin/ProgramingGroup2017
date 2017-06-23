package com.season2.ocp.newcode;

import com.season2.ocp.old.DateUtil;

public class AddDateLog implements FormatterLog {

	@Override
	public String resolveLog(String originLog) {
		String txtDate = DateUtil.getCurrentDateAsString();
		return txtDate + ": " + originLog;
	}

}
