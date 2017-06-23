package com.season2.ocp.newcode;

public class TestLogDeal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintLog printLog = new PrintLog();
		EmailLog emailLog = new EmailLog();
		SmsLog smsLog = new SmsLog();
		
		DoNothigLog doNothigLog = new DoNothigLog();
		AddDateLog adddDateLog = new AddDateLog();
		
		// 这里还可以考虑使用工厂方法来创建不同的LogDeal类
		LogDeal logDeal = new LogDeal(adddDateLog, smsLog);
		logDeal.log("这是日志的内容");
	}

}
