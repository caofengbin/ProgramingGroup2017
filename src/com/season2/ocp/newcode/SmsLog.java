package com.season2.ocp.newcode;

public class SmsLog implements Sender {

	@Override
	public void sendLog(String sendMessage) {
		System.out.println("SmsLog发送日志:" + sendMessage);
	}

}
