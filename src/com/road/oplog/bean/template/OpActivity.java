/**
 * All rights reserved. This material is confidential and proprietary to 7ROAD DDT team.
 */
package com.road.oplog.bean.template;

import com.road.oplog.bean.IOpType;
import com.road.oplog.bean.OpLogInfo;
import com.road.oplog.bean.OpHeader;

/**
 * (必填)活动流水运营日志<br>
 * 
 * Generated by the OpBeanCodeGenTool. DO NOT EDIT!<br>
 * @author OpBeanCodeGenTool
 * 
 */
@IOpType(code = "Activity", desc = "(必填)活动流水运营日志")
public class OpActivity extends OpHeader
{
	/* (必填)活动类型 */
	private int activityType;
	/* (必填)活动iD */
	private int activityId;
	/* (必填)任务id */
	private int taskId;
	/* (必填)任务状态 0-未达成  1-已达成 */
	private int taskStatus;
    
    public OpActivity(String tableName, OpLogInfo opLogInfo)
    {
    	super(tableName, opLogInfo);
    }

	/**
	 * <pre>
	 * (必填)活动类型
	 * </pre>
	 */
	public void setActivityType(int activityType)
	{
		this.activityType = activityType;
	}

	/**
	 * <pre>
	 * (必填)活动类型
	 * </pre>
	 */
	public int getActivityType()
	{
		return activityType;
	}

	/**
	 * <pre>
	 * (必填)活动iD
	 * </pre>
	 */
	public void setActivityId(int activityId)
	{
		this.activityId = activityId;
	}

	/**
	 * <pre>
	 * (必填)活动iD
	 * </pre>
	 */
	public int getActivityId()
	{
		return activityId;
	}

	/**
	 * <pre>
	 * (必填)任务id
	 * </pre>
	 */
	public void setTaskId(int taskId)
	{
		this.taskId = taskId;
	}

	/**
	 * <pre>
	 * (必填)任务id
	 * </pre>
	 */
	public int getTaskId()
	{
		return taskId;
	}

	/**
	 * <pre>
	 * (必填)任务状态 0-未达成  1-已达成
	 * </pre>
	 */
	public void setTaskStatus(int taskStatus)
	{
		this.taskStatus = taskStatus;
	}

	/**
	 * <pre>
	 * (必填)任务状态 0-未达成  1-已达成
	 * </pre>
	 */
	public int getTaskStatus()
	{
		return taskStatus;
	}
}