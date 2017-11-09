package com.youguu.market.sh.data;


public class CommonStockInfo extends BaseStockInfo implements Cloneable {

	private static final short pojoType = 1;

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 109440135393239603L;

	/**
	 * �г�id,����client faceʹ��
	 */
	private int marketId;

	/**
	 * ֤ȯ����.
	 */
	protected String stockCode;

	/**
	 * ֤ȯ���ļ��.
	 */
	private String cnName;

	/**
	 * ֤ȯӢ�ļ��.
	 */
	private String enName;

	/**
	 * ���¼۸�
	 */
	private double lastPrice;

	/**
	 * ǰ����.
	 */
	private double preClose;

	/**
	 * ����.
	 */
	private double todayOpen;

	/**
	 * ������.
	 */
	private double todayClose;

	/**
	 * ��ǰ�����
	 */
	private double bid;

	/**
	 * ��ǰ������
	 */
	private double ask;

	/**
	 * �������
	 */
	private double bidSpread;
	/**
	 * ������
	 */
	private double askSpread;

	/**
	 * ����1 ����5
	 */
	private double askPrice1;

	private long askVolume1;

	private double askPrice2;

	private long askVolume2;

	private double askPrice3;

	private long askVolume3;

	private double askPrice4;

	private long askVolume4;

	private double askPrice5;

	private long askVolume5;

	/**
	 * ����1 ����5
	 */
	private double bidPrice1;

	private long bidVolume1;

	private double bidPrice2;

	private long bidVolume2;

	private double bidPrice3;

	private long bidVolume3;

	private double bidPrice4;

	private long bidVolume4;

	private double bidPrice5;

	private long bidVolume5;

	/**
	 * ��߼�.
	 */
	private double highPrice;

	/**
	 * ��ͼ�.
	 */
	private double lowPrice;

	/**
	 * ����
	 */
	private double netChange;

	/**
	 * ������
	 */
	private float netChangeRation;

	/**
	 * �ɽ���.
	 */
	private long volume;

	/**
	 * �ɽ���� ,�����ɽ�����ֱ�Ӹ��� ��Ҳ��������ϸ�ɽ����͵�ǰ�۸�����ۼƸ���
	 */
	private double turnOver;

	/**
	 * 52����߼�
	 */
	private double yearHigh;

	/**
	 * 52����ͼ�
	 */
	private double yearLow;

	/**
	 * ��ӯ��
	 */
	private float peRatio;

	/**
	 * Ϣ��
	 */
	private float yield;

	/**
	 * ÿ�ֹ���
	 */
	private int lotSize;

	/**
	 * ���ҵ�λ
	 */
	private String currency;

	/**
	 * ��ֵ
	 */
	private double marketCap;
	/**
	 * �Ƿ�ͣ��
	 */
	private boolean suspend;
	/**
	 * ������
	 */
	private long expiredate;

	/**
	 * ���
	 */
	private double premium;
	/**
	 * �ܸ˱���
	 */
	private float gearingRatio;

	/**
	 * ���ɼ�
	 */
	private double convPrice;
	/**
	 * ������
	 */
	private float convRation;

	/**
	 * ��ʱ����ʱ�䣬��ʱ������ֱ��ת���ɳ����ν��д洢
	 */
	private long datetime;

	/////��Ҫ��ȡ������Ϣ��������
	/**
	 * ���ֽ�Ϊ������Ϣ ���ֽ�ΪС����Ϣ
	 * 0x0100ָ�� 0x0200��Ʊ 0x0300���� 0x0400ծȯ 0x0500Ȩ֤
	 */
	private short fullType;


	/////��Ҫ���м����ֵ
	/**
	 * ������
	 */
	private float swap;

	/**
	 * ����
	 */
	private float volumeRatio;
	/**
	 * ί��
	 */
	private float entrustRatio;
	/**
	 * ����
	 */
	private float velocityRatio;

	/**
	 * ����
	 */
	private long inSide;
	/**
	 * ����
	 */
	private long outSide;
	/**
	 * ����
	 */
	private long curVolume;

	/**
	 * ���
	 */
	private float swing;

	/**
	 * �ɽ�����
	 */
	private int tradeCount;

	/**
	 * �о���
	 */
	private float PBration;

	private double last5MinPrice;

	private double last3MinPrice;

	private double last1MinPrice;

	/**
	 * ��ȥ5��������ÿ����ƽ��������.tangyh added 2010-09-02
	 */
	private double fiveDaysMinuteVolumeAvg;

	/**
	 * ��ί��.tangyh added 2010-09-03
	 */
	private long totalBid;

	/**
	 * ��ί��.tangyh added 2010-09-03
	 */
	private long totalAsk;

	/**
	 * ��ͨ�ܹɱ�.tangyh added 2010-09-03
	 */
	private double floatTotalMarketCap;

	/**
	 * ��ͨ��Ʊ������.tangyh added 2010-09-09
	 */
	private byte commonRdp;

	/**
	 * ��ͨ��Ʊ�ϴ����������.tangyh added 2010-09-09
	 */
	private byte commonOldRdp;

	/**
	 * ί��
	 *
	 * @param stock
	 * @return
	 */
	private long weicha;

	/**
	 * ��ͣ��
	 *
	 * @param stock
	 * @return
	 */
	private double riseLimitPrice;

	/**
	 * ��ͣ��
	 *
	 * @param stock
	 * @return
	 */
	private double declientLimitPrice;

	private double tradeAmountIn;

	private double tradeAmountOut;

	private long tradeVolIn;

	private long tradeVolOut;

	private String securityPreName;
	//ashlee ֤ȯ����  'Z' ���й�Ʊ �� 'N' ������'S' ST ��Ʊ��'*' *ST ��Ʊ��4 �ɷ�ת�ã�
	//5 ���п��Ż���LOF��6  �����Ϳ���ʽָ������ETF����7 �ǽ����Ϳ���ʽ����
	//8 ���ṩ��ֵ��ʾ����Ŀ���ʽ����9 ����Э�齻��ƽ̨���ƽ��׵�֤ȯ��
	private byte securityProperties;

	public byte getSecurityProperties() {
		return securityProperties;
	}

	public void setSecurityProperties(byte securityProperties) {
		this.securityProperties = securityProperties;
	}

	public double getAsk() {
		return ask;
	}

	public void setAsk(double ask) {
		this.ask = ask;
	}

	public double getAskPrice1() {
		return askPrice1;
	}

	public void setAskPrice1(double askPrice1) {
		this.askPrice1 = askPrice1;
	}

	public double getAskPrice2() {
		return askPrice2;
	}

	public void setAskPrice2(double askPrice2) {
		this.askPrice2 = askPrice2;
	}

	public double getAskPrice3() {
		return askPrice3;
	}

	public void setAskPrice3(double askPrice3) {
		this.askPrice3 = askPrice3;
	}

	public double getAskPrice4() {
		return askPrice4;
	}

	public void setAskPrice4(double askPrice4) {
		this.askPrice4 = askPrice4;
	}

	public double getAskPrice5() {
		return askPrice5;
	}

	public void setAskPrice5(double askPrice5) {
		this.askPrice5 = askPrice5;
	}

	public double getAskSpread() {
		return askSpread;
	}

	public void setAskSpread(double askSpread) {
		this.askSpread = askSpread;
	}

	public long getAskVolume1() {
		return askVolume1;
	}

	public void setAskVolume1(long askVolume1) {
		this.askVolume1 = askVolume1;
	}

	public long getAskVolume2() {
		return askVolume2;
	}

	public void setAskVolume2(long askVolume2) {
		this.askVolume2 = askVolume2;
	}

	public long getAskVolume3() {
		return askVolume3;
	}

	public void setAskVolume3(long askVolume3) {
		this.askVolume3 = askVolume3;
	}

	public long getAskVolume4() {
		return askVolume4;
	}

	public void setAskVolume4(long askVolume4) {
		this.askVolume4 = askVolume4;
	}

	public long getAskVolume5() {
		return askVolume5;
	}

	public void setAskVolume5(long askVolume5) {
		this.askVolume5 = askVolume5;
	}

	public double getBid() {
		return bid;
	}

	public void setBid(double bid) {
		this.bid = bid;
	}

	public double getBidPrice1() {
		return bidPrice1;
	}

	public void setBidPrice1(double bidPrice1) {
		this.bidPrice1 = bidPrice1;
	}

	public double getBidPrice2() {
		return bidPrice2;
	}

	public void setBidPrice2(double bidPrice2) {
		this.bidPrice2 = bidPrice2;
	}

	public double getBidPrice3() {
		return bidPrice3;
	}

	public void setBidPrice3(double bidPrice3) {
		this.bidPrice3 = bidPrice3;
	}

	public double getBidPrice4() {
		return bidPrice4;
	}

	public void setBidPrice4(double bidPrice4) {
		this.bidPrice4 = bidPrice4;
	}

	public double getBidPrice5() {
		return bidPrice5;
	}

	public void setBidPrice5(double bidPrice5) {
		this.bidPrice5 = bidPrice5;
	}

	public double getBidSpread() {
		return bidSpread;
	}

	public void setBidSpread(double bidSpread) {
		this.bidSpread = bidSpread;
	}

	public long getBidVolume1() {
		return bidVolume1;
	}

	public void setBidVolume1(long bidVolume1) {
		this.bidVolume1 = bidVolume1;
	}

	public long getBidVolume2() {
		return bidVolume2;
	}

	public void setBidVolume2(long bidVolume2) {
		this.bidVolume2 = bidVolume2;
	}

	public long getBidVolume3() {
		return bidVolume3;
	}

	public void setBidVolume3(long bidVolume3) {
		this.bidVolume3 = bidVolume3;
	}

	public long getBidVolume4() {
		return bidVolume4;
	}

	public void setBidVolume4(long bidVolume4) {
		this.bidVolume4 = bidVolume4;
	}

	public long getBidVolume5() {
		return bidVolume5;
	}

	public void setBidVolume5(long bidVolume5) {
		this.bidVolume5 = bidVolume5;
	}

	public String getCnName() {
		return cnName;
	}

	public void setCnName(String cnName) {
		this.cnName = cnName;
	}


	public double getConvPrice() {
		return convPrice;
	}

	public void setConvPrice(double convPrice) {
		this.convPrice = convPrice;
	}

	public float getConvRation() {
		return convRation;
	}

	public void setConvRation(float convRation) {
		this.convRation = convRation;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public long getCurVolume() {
		return curVolume;
	}

	public void setCurVolume(long curVolume) {
		this.curVolume = curVolume;
	}

	public long getDatetime() {
		return datetime;
	}

	public void setDatetime(long datetime) {
		this.datetime = datetime;
	}

	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public float getEntrustRatio() {
		return entrustRatio;
	}

	public void setEntrustRatio(float entrustRatio) {
		this.entrustRatio = entrustRatio;
	}

	public long getExpiredate() {
		return expiredate;
	}

	public void setExpiredate(long expiredate) {
		this.expiredate = expiredate;
	}

	public float getGearingRatio() {
		return gearingRatio;
	}

	public void setGearingRatio(float gearingRatio) {
		this.gearingRatio = gearingRatio;
	}

	public double getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(double highPrice) {
		this.highPrice = highPrice;
	}

	public long getInSide() {
		return inSide;
	}

	public void setInSide(long inSide) {
		this.inSide = inSide;
	}

	public double getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}

	public int getLotSize() {
		return lotSize;
	}

	public void setLotSize(int lotSize) {
		this.lotSize = lotSize;
	}

	public double getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(double lowPrice) {
		this.lowPrice = lowPrice;
	}

	public double getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(double marketCap) {
		this.marketCap = marketCap;
	}

	public double getNetChange() {
		return netChange;
	}

	public void setNetChange(double netChange) {
		this.netChange = netChange;
	}

	public float getNetChangeRation() {
		return netChangeRation;
	}

	public void setNetChangeRation(float netChangeRation) {
		this.netChangeRation = netChangeRation;
	}

	public long getOutSide() {
		return outSide;
	}

	public void setOutSide(long outSide) {
		this.outSide = outSide;
	}

	public float getPeRatio() {
		return peRatio;
	}

	public void setPeRatio(float peRatio) {
		this.peRatio = peRatio;
	}

	public double getPreClose() {
		return preClose;
	}

	public void setPreClose(double preClose) {
		this.preClose = preClose;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode.trim();
	}

	public boolean isSuspend() {
		return suspend;
	}

	public void setSuspend(boolean suspend) {
		this.suspend = suspend;
	}

	public float getSwap() {
		return swap;
	}

	public void setSwap(float swap) {
		this.swap = swap;
	}

	public float getSwing() {
		return swing;
	}

	public void setSwing(float swing) {
		this.swing = swing;
	}

	public double getTodayClose() {
		return todayClose;
	}

	public void setTodayClose(double todayClose) {
		this.todayClose = todayClose;
	}

	public double getTodayOpen() {
		return todayOpen;
	}

	public void setTodayOpen(double todayOpen) {
		this.todayOpen = todayOpen;
	}

	public int getTradeCount() {
		return tradeCount;
	}

	public void setTradeCount(int tradeCount) {
		this.tradeCount = tradeCount;
	}

	public double getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(double turnOver) {
		this.turnOver = turnOver;
	}

	public float getVelocityRatio() {
		return velocityRatio;
	}

	public void setVelocityRatio(float velocityRatio) {
		this.velocityRatio = velocityRatio;
	}

	public long getVolume() {
		return volume;
	}

	public void setVolume(long volume) {
		this.volume = volume;
	}

	public float getVolumeRatio() {
		return volumeRatio;
	}

	public void setVolumeRatio(float volumeRatio) {
		this.volumeRatio = volumeRatio;
	}

	public double getYearHigh() {
		return yearHigh;
	}

	public void setYearHigh(double yearHigh) {
		this.yearHigh = yearHigh;
	}

	public double getYearLow() {
		return yearLow;
	}

	public void setYearLow(double yearLow) {
		this.yearLow = yearLow;
	}

	public float getYield() {
		return yield;
	}

	public void setYield(float yield) {
		this.yield = yield;
	}

	public byte getType() {
		return (byte) (fullType >>> 8);
	}

	/**
	 * ���ݣ���ʹ��setFullType
	 *
	 * @param bigtype
	 */
	public void setType(byte bigtype) {
		short ft = (short) ((bigtype & 0xff) << 8);
		this.setFullType(ft);
	}

	public byte getSubType() {
		return (byte) fullType;
	}

	public void setFullType(short fulltype) {
		this.fullType = fulltype;
	}

	public short getFullType() {
		return fullType;
	}

	public int getMarketId() {
		return marketId;
	}

	public void setMarketId(int marketId) {
		this.marketId = marketId;
	}

	public float getPBration() {
		return PBration;
	}

	public void setPBration(float bration) {
		PBration = bration;
	}


	public double getLast5MinPrice() {
		return last5MinPrice;
	}

	public void setLast5MinPrice(double last5MinPrice) {
		this.last5MinPrice = last5MinPrice;
	}

	public double getLast3MinPrice() {
		return last3MinPrice;
	}

	public void setLast3MinPrice(double last3MinPrice) {
		this.last3MinPrice = last3MinPrice;
	}

	public double getLast1MinPrice() {
		return last1MinPrice;
	}

	public void setLast1MinPrice(double last1MinPrice) {
		this.last1MinPrice = last1MinPrice;
	}

	public double getFiveDaysMinuteVolumeAvg() {
		return fiveDaysMinuteVolumeAvg;
	}

	public void setFiveDaysMinuteVolumeAvg(double fiveDaysMinuteVolumeAvg) {
		this.fiveDaysMinuteVolumeAvg = fiveDaysMinuteVolumeAvg;
	}

	public long getTotalBid() {
		return totalBid;
	}

	public void setTotalBid(long totalBid) {
		this.totalBid = totalBid;
	}

	public long getTotalAsk() {
		return totalAsk;
	}

	public void setTotalAsk(long totalAsk) {
		this.totalAsk = totalAsk;
	}

	public double getFloatTotalMarketCap() {
		return floatTotalMarketCap;
	}

	public void setFloatTotalMarketCap(double floatTotalMarketCap) {
		this.floatTotalMarketCap = floatTotalMarketCap;
	}

	public byte getCommonRdp() {
		return commonRdp;
	}

	public void setCommonRdp(byte commonRdp) {
		this.commonRdp = commonRdp;
	}

	public byte getCommonOldRdp() {
		return commonOldRdp;
	}

	public void setCommonOldRdp(byte commonOldRdp) {
		this.commonOldRdp = commonOldRdp;
	}

	public long getWeicha() {
		return weicha;
	}

	public void setWeicha(long weicha) {
		this.weicha = weicha;
	}

	public double getRiseLimitPrice() {
		return riseLimitPrice;
	}

	public void setRiseLimitPrice(double riseLimitPrice) {
		this.riseLimitPrice = riseLimitPrice;
	}

	public double getDeclientLimitPrice() {
		return declientLimitPrice;
	}

	public void setDeclientLimitPrice(double declientLimitPrice) {
		this.declientLimitPrice = declientLimitPrice;
	}

	public double getTradeAmountIn() {
		return tradeAmountIn;
	}

	public void setTradeAmountIn(double tradeAmountIn) {
		this.tradeAmountIn = tradeAmountIn;
	}

	public double getTradeAmountOut() {
		return tradeAmountOut;
	}

	public void setTradeAmountOut(double tradeAmountOut) {
		this.tradeAmountOut = tradeAmountOut;
	}

	public long getTradeVolIn() {
		return tradeVolIn;
	}

	public void setTradeVolIn(long tradeVolIn) {
		this.tradeVolIn = tradeVolIn;
	}

	public long getTradeVolOut() {
		return tradeVolOut;
	}

	public void setTradeVolOut(long tradeVolOut) {
		this.tradeVolOut = tradeVolOut;
	}

	public String getSecurityPreName() {
		return securityPreName;
	}

	public void setSecurityPreName(String securityPreName) {
		this.securityPreName = securityPreName;
	}

	public short getPojoType() {
		return pojoType;
	}
}
