package com.season2.ocp.newcode;

public class LogDeal {

	private FormatterLog mResolveLog;
	private Sender mSendLog;
	
	public LogDeal(FormatterLog resolveLog, Sender sendLog) {
		mResolveLog = resolveLog;
		mSendLog = sendLog;
	}
	
	public void log(String msg){
		String log = mResolveLog.resolveLog(msg);
		mSendLog.sendLog(log);
	}
}
