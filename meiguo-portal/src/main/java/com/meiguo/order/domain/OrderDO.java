package com.meiguo.order.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * 订单表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-11-02 10:51:27
 */
public class OrderDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//订单ID
	private Long id;
	//订单编号,系统生成
	private String orderNo;
	//用户ID
	private Long userId;
	//支付方式 0=积分兑换，1=在线支付
	private Integer payType;
	//配送时间 1=不限送货时间，2=工作日送货，3=双休日、假日送货
	private Integer shipmentTime;
	//配送方式 0=快递配送（免运费），1=快递配送（运费）
	private Integer shipmentType;
	//快递费
	private BigDecimal shipmentAmount;
	//支付方式 1=不开发票，2=电子发票，3=普通发票
	private Integer invoiceType;
	//发票抬头
	private String invoiceTitle;
	//订单状态 -1=已删除，0=待支付，1=已支付，2=已发货，3=已完成
	private Integer orderStatus;
	//运单号
	private String postid;
	//创建时间
	private Date createTime;
	//更新时间
	private Date updateTime;
	//订单金额
	private BigDecimal orderAmount;
	//订单积分
	private Integer orderScore;
	//支付金额 = 订单金额 + 快递费
	private BigDecimal payAmount;
	//商品总数量
	private Integer buyNumber;
	//收货地址
	private String address;
	//收货人
	private String consignee;
	//收货手机号
	private String mobile;
	//订单明细
	private List<OrderProductDO> list = new ArrayList<OrderProductDO>();
	//订单货品图
	private String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public List<OrderProductDO> getList() {
		return list;
	}
	public void setList(List<OrderProductDO> list) {
		this.list = list;
	}
	
	/**
	 * 设置：订单ID
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：订单ID
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：订单编号,系统生成
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	/**
	 * 获取：订单编号,系统生成
	 */
	public String getOrderNo() {
		return orderNo;
	}
	/**
	 * 设置：用户ID
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户ID
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：支付方式 0=积分兑换，1=在线支付
	 */
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
	/**
	 * 获取：支付方式 0=积分兑换，1=在线支付
	 */
	public Integer getPayType() {
		return payType;
	}
	/**
	 * 设置：配送时间 1=不限送货时间，2=工作日送货，3=双休日、假日送货
	 */
	public void setShipmentTime(Integer shipmentTime) {
		this.shipmentTime = shipmentTime;
	}
	/**
	 * 获取：配送时间 1=不限送货时间，2=工作日送货，3=双休日、假日送货
	 */
	public Integer getShipmentTime() {
		return shipmentTime;
	}
	/**
	 * 设置：配送方式 0=快递配送（免运费），1=快递配送（运费）
	 */
	public void setShipmentType(Integer shipmentType) {
		this.shipmentType = shipmentType;
	}
	/**
	 * 获取：配送方式 0=快递配送（免运费），1=快递配送（运费）
	 */
	public Integer getShipmentType() {
		return shipmentType;
	}
	/**
	 * 设置：快递费
	 */
	public void setShipmentAmount(BigDecimal shipmentAmount) {
		this.shipmentAmount = shipmentAmount;
	}
	/**
	 * 获取：快递费
	 */
	public BigDecimal getShipmentAmount() {
		return shipmentAmount;
	}
	/**
	 * 设置：支付方式 1=不开发票，2=电子发票，3=普通发票
	 */
	public void setInvoiceType(Integer invoiceType) {
		this.invoiceType = invoiceType;
	}
	/**
	 * 获取：支付方式 1=不开发票，2=电子发票，3=普通发票
	 */
	public Integer getInvoiceType() {
		return invoiceType;
	}
	/**
	 * 设置：发票抬头
	 */
	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}
	/**
	 * 获取：发票抬头
	 */
	public String getInvoiceTitle() {
		return invoiceTitle;
	}
	/**
	 * 设置：订单状态 -1=已删除，0=待支付，1=已支付，2=已发货，3=已完成
	 */
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * 获取：订单状态 -1=已删除，0=待支付，1=已支付，2=已发货，3=已完成
	 */
	public Integer getOrderStatus() {
		return orderStatus;
	}
	/**
	 * 设置：运单号
	 */
	public void setPostid(String postid) {
		this.postid = postid;
	}
	/**
	 * 获取：运单号
	 */
	public String getPostid() {
		return postid;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：订单金额
	 */
	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}
	/**
	 * 获取：订单金额
	 */
	public BigDecimal getOrderAmount() {
		return orderAmount;
	}
	/**
	 * 设置：订单积分
	 */
	public void setOrderScore(Integer orderScore) {
		this.orderScore = orderScore;
	}
	/**
	 * 获取：订单积分
	 */
	public Integer getOrderScore() {
		return orderScore;
	}
	/**
	 * 设置：支付金额 = 订单金额 + 快递费
	 */
	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}
	/**
	 * 获取：支付金额 = 订单金额 + 快递费
	 */
	public BigDecimal getPayAmount() {
		return payAmount;
	}
	/**
	 * 设置：商品总数量
	 */
	public void setBuyNumber(Integer buyNumber) {
		this.buyNumber = buyNumber;
	}
	/**
	 * 获取：商品总数量
	 */
	public Integer getBuyNumber() {
		return buyNumber;
	}
	/**
	 * 设置：
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：收货人
	 */
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	/**
	 * 获取：收货人
	 */
	public String getConsignee() {
		return consignee;
	}
	/**
	 * 设置：收货手机号
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 获取：收货手机号
	 */
	public String getMobile() {
		return mobile;
	}
}
