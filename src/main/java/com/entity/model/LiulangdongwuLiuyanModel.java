package com.entity.model;

import com.entity.LiulangdongwuLiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 流浪动物留言
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LiulangdongwuLiuyanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 流浪动物
     */
    private Integer liulangdongwuId;


    /**
     * 业主
     */
    private Integer yezhuId;


    /**
     * 留言内容
     */
    private String liulangdongwuLiuyanText;


    /**
     * 留言时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 回复内容
     */
    private String replyText;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：流浪动物
	 */
    public Integer getLiulangdongwuId() {
        return liulangdongwuId;
    }


    /**
	 * 设置：流浪动物
	 */
    public void setLiulangdongwuId(Integer liulangdongwuId) {
        this.liulangdongwuId = liulangdongwuId;
    }
    /**
	 * 获取：业主
	 */
    public Integer getYezhuId() {
        return yezhuId;
    }


    /**
	 * 设置：业主
	 */
    public void setYezhuId(Integer yezhuId) {
        this.yezhuId = yezhuId;
    }
    /**
	 * 获取：留言内容
	 */
    public String getLiulangdongwuLiuyanText() {
        return liulangdongwuLiuyanText;
    }


    /**
	 * 设置：留言内容
	 */
    public void setLiulangdongwuLiuyanText(String liulangdongwuLiuyanText) {
        this.liulangdongwuLiuyanText = liulangdongwuLiuyanText;
    }
    /**
	 * 获取：留言时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：留言时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：回复内容
	 */
    public String getReplyText() {
        return replyText;
    }


    /**
	 * 设置：回复内容
	 */
    public void setReplyText(String replyText) {
        this.replyText = replyText;
    }
    /**
	 * 获取：回复时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 设置：回复时间
	 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
