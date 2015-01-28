package com.sylar.provide;

import com.sylar.service.IProcessData;

public class ProcessDataImpl implements IProcessData {

	public String deal(String data) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Finished:" + data;
	}
}
