package com.quartz.job;

import java.util.ArrayList;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;

public class DumbJob implements Job {

	private static int num = 1;

	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAs"+num);
		JobKey key = context.getJobDetail().getKey();


		System.out.println("AAAAAAAAAAAAAAAAAAAAAAe:"+num+++key);
	}
}