package com.season2.ocp.newcode;

public class PrintLog implements Sender {

	@Override
	public void sendLog(String sendMessage) {
		System.out.println("PrintLog发送日志:" + sendMessage);
	}

}
