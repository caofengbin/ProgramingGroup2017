package com.season2.ocp.newcode;

public class DoNothigLog implements FormatterLog {

	@Override
	public String resolveLog(String originLog) {
		return originLog;
	}

}
