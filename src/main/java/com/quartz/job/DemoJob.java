package com.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;

public class DemoJob implements Job {

	private static int num = 1;

	@Override
	public void execute(JobExecutionContext context) {

		JobKey key = context.getJobDetail().getKey();

		System.out.println("AAAAAAAAAAAAAAAAAAAAAAe:" + num++ + key);

	}

	public void execute() {

		System.out.println("CCCCCCCCCCCCCCCCCCCCCCCe:" + num++);

	}

	public void printMessage() {
		System.out
				.println("I am called by MethodInvokingJobDetailFactoryBean using SimpleTriggerFactoryBean");
	}

}
