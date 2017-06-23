package com.season2.ocp.newcode;

public class EmailLog implements Sender {

	@Override
	public void sendLog(String sendMessage) {
		System.out.println("EmailLog发送日志:" + sendMessage);
	}

}
