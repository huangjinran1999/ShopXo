package PageAction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Base.BasePage;
import Base.DriverBase;
import Page.CollectionPage;
import Page.GoodsPage;
import utils.Log;

public class GoodsAction extends LoadableComponent{
	private BasePage page;
	private GoodsPage gPage;
	String url;
	String title;
	
	public GoodsAction(BasePage page){
		this.page=page;
		this.gPage=PageFactory.initElements(page.getDriver(), GoodsPage.class);
	}
	
	//点击打开链接
	public void load() {}
	
	//获取url
	public String getUrl(int goodsId) {
		if(goodsId==1) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/1.html";
			title="MIUI/小米 小米手机4 小米4代 MI4智能4G手机包邮 黑色 D-LTE（4G）/TD-SCD";
		}else if(goodsId==2) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/2.html";
			title="苹果（Apple）iPhone 6 Plus (A1524)移动联通电信4G手机 金色 16G";
		}else if(goodsId==3) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/3.html";
			title="Samsung/三星 SM-G8508S GALAXY Alpha四核智能手机 新品 闪耀白";
		}else if(goodsId==4) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/4.html";
			title="Huawei/华为 H60-L01 荣耀6 移动4G版智能手机 安卓";
		}else if(goodsId==5) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/5.html";
			title="Meizu/魅族 MX4 Pro移动版 八核大屏智能手机 黑色 16G";
		}else if(goodsId==6) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/6.html";
			title="vivo X5MAX L 移动4G 八核超薄大屏5.5吋双卡手机vivoX5max";
		}else if(goodsId==7) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/7.html";
			title="纽芝兰包包女士2018新款潮百搭韩版时尚单肩斜挎包少女小挎包链条";
		}else if(goodsId==8) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/8.html";
			title="MARNI Trunk 女士 中号拼色十字纹小牛皮 斜挎风琴包";
		}else if(goodsId==9) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/9.html";
			title="睡衣女长袖春秋季纯棉韩版女士大码薄款春夏季全棉家居服两件套装";
		}else if(goodsId==10) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/10.html";
			title="夏装女装古力娜扎明星同款一字领露肩蓝色蕾丝修身显瘦连衣裙礼服";
		}else if(goodsId==11) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/11.html";
			title="夏季复古ins风格网红SP同款 短袖大圆领香槟色蕾丝绣花钉珠连衣裙";
		}else if(goodsId==12) {
			url="http://127.0.0.1/index.php?s=/index/goods/index/id/12.html";
			title="ZK爆款连衣裙";
		}
		return url;
	}
		
	//点击商品图片
	public void clickGoodsImage() throws InterruptedException {
		page.click(gPage.selectGoodsImage);
		Log.info("点击商品图片");
	}
	
	//查看商品视频
	public void checkGoodsVideo() throws InterruptedException {
		page.click(gPage.selectGoodsVideo);
		page.operateVideo(gPage.video);
		Log.info("查看商品视频");
	}
	
	//点击关闭商品视频
	public void clickCloseVideo() throws InterruptedException {
		page.click(gPage.buttonCloseVideo);
		Log.info("关闭视频");
	}
	
	//点击选择商品2套餐
	public void clickSelectGoods2Package(String text) throws InterruptedException {
		if(text=="套餐一") {
			page.click(gPage.selectPackage1);
			Log.info("选择："+text);
		}else if(text=="套餐二") {
			page.click(gPage.selectPackage2);
			Log.info("选择："+text);
		}else {
			Log.error("套餐错误");
		}
	}
	
	//点击选择商品2颜色
	public void clickSelectGoods2Color(String text) throws InterruptedException {
		if(text=="金色") {
			page.click(gPage.selectColorGold);
			Log.info("选择："+text);
		}else if(text=="银色") {
			page.click(gPage.selectColorSilver);
			Log.info("选择："+text);
		}else {
			Log.error("颜色错误");
		}
	}
	
	//点击选择商品9颜色
	public void clickSelectGoods9Color(String text) throws InterruptedException {
		if(text=="白色") {
			page.click(gPage.selectColorWhite);
			Log.info("选择："+text);
		}else if(text=="粉色") {
			page.click(gPage.selectColorPink);
			Log.info("选择："+text);
		}else if(text=="黑色") {
			page.click(gPage.selectColorBlack);
			Log.info("选择："+text);
		}else {
			Log.error("颜色错误");
		}
	}
	
	//点击选择商品12颜色
	public void clickSelectGoods12Color(String text) throws InterruptedException {
		if(text=="粉色") {
			page.click(gPage.selectColorPink);
			Log.info("选择："+text);
		}else if(text=="白色") {
			page.click(gPage.selectColorWhite);
			Log.info("选择："+text);
		}else {
			Log.error("颜色错误");
		}
	}
	
	//点击选择商品2容量
	public void clickSelectGoods2Capacity(String text) throws InterruptedException {
		if(text=="32G") {
			page.click(gPage.selectCapacity32);
			Log.info("选择："+text);
		}else if(text=="64G") {
			page.click(gPage.selectCapacity64);
			Log.info("选择："+text);
		}else if(text=="128G") {
			page.click(gPage.selectCapacity128);
			Log.info("选择："+text);
		}else {
			Log.error("容量错误");
		}
	}
	
	//点击选择商品12尺码
	public void clickSelectGoods12Size(String text) throws InterruptedException {
		if(text=="S") {
			page.click(gPage.selectSizeS);
			Log.info("选择："+text);
		}else if(text=="M") {
			page.click(gPage.selectSizeM);
			Log.info("选择："+text);
		}else if(text=="L") {
			page.click(gPage.selectSizeL);
			Log.info("选择："+text);
		}else {
			Log.error("尺码错误");
		}
	}
	
	//点击选择商品11尺码
	public void clickSelectGoods11Size(String text) throws InterruptedException {
		if(text=="M") {
			page.click(gPage.selectSizeM);
			Log.info("选择："+text);
		}else if(text=="L") {
			page.click(gPage.selectSizeL);
			Log.info("选择："+text);
		}else if(text=="XL") {
			page.click(gPage.selectSizeXL);
			Log.info("选择："+text);
		}else {
			Log.error("尺码错误");
		}
	}
	
	//点击选择商品9尺码
	public void clickSelectGoods9Size(String text) throws InterruptedException {
		if(text=="S") {
			page.click(gPage.selectSizeS);
			Log.info("选择："+text);
		}else if(text=="M") {
			page.click(gPage.selectSizeM);
			Log.info("选择："+text);
		}else if(text=="L") {
			page.click(gPage.selectSizeL);
			Log.info("选择："+text);
		}else if(text=="XL") {
			page.click(gPage.selectSizeXL);
			Log.info("选择："+text);
		}else {
			Log.error("尺码错误");
		}
	}

	//输入商品数量
	public void inputGoodsNumber(String number) throws InterruptedException {
		int n=Integer.parseInt(number);
		if(n>=0&&n<=this.checkGoodsInventory()) {
			page.type(gPage.inputNumber, number);
			Log.info("选择商品数量："+number);
		}else {
			Log.error("商品数量错误");
		}
	}
	
	//查看商品库存并返回
	public int checkGoodsInventory() {
		String inventory= page.getElementAttribute(gPage.getAttributeInventory, "data-original-stock");
		int store=Integer.parseInt(inventory);
		Log.info("库存数量为："+inventory);
		return store;
	}
	
	//点击收藏商品
	public void clickFavor() throws InterruptedException {
		page.click(gPage.buttonFavor);
		Log.info("点击收藏商品");
	}
	
	//点击立即购买商品
	public void clickBuy() throws InterruptedException {
		page.click(gPage.buttonBuy);
		Log.info("点击立即购买");
		
	}
	
	//点击将商品加入购物车
	public void clickJoinCart() throws InterruptedException {
		page.click(gPage.buttonJoinCart);
		Log.info("点击加入购物车");
	}
	
	//进入frame
	public void enterFrame() throws InterruptedException {
		page.enterFrame(gPage.iframe);
		Log.info("进入登录frame");
	}
	
	//点击进入注册页面
	public void clickLinkRegister() throws InterruptedException {
		page.click(gPage.linkFrameRegister);
		Log.info("进入注册页面");
	}
	
	//iframe中输入账号
	public void inputUserName(String text) throws InterruptedException {
		page.type(gPage.inputUserName, text);
		Log.info("输入登录账号："+text);
	}
	
	//iframe中输入密码
	public void inputPassword(String text) throws InterruptedException {
		page.type(gPage.inputPassword, text);
		Log.info("输入登录密码："+text);
	}
	
	//iFrame点击登录
	public void clickIframeLogin() throws InterruptedException {
		page.click(gPage.buttonSubmit);
		Log.info("点击登录");
	}
	
	//点击进入忘记密码页面
	public void clickLinkForgetPassword() throws InterruptedException {
		page.click(gPage.linkForgetPassword);
		Log.info("进入忘记密码页面");
	}
	
	//退出frame
	public void leaveFrame() throws InterruptedException {
		page.leaveFrame();
		Log.info("退出登录frame");
	}

	//点击查看商品详情
	public void clickCheckDetail() throws InterruptedException {
		page.click(gPage.selectDetail);
		if(page.isTextExist("商品细节")) {
			Log.info("查看商品详情");
		}else {
			Log.error("查看商品详情失败");
		}
	}
	
	//点击查看商品评论
	public void clickCheckComment() throws InterruptedException {
		page.click(gPage.selectComments);
		if(page.isTextExist("动态评分")) {
			Log.info("查看商品评论");
		}else {
			Log.error("查看评论失败");
		}
		
	}
	
	//点击查看猜你喜欢
	public void clickCheckGuess() throws InterruptedException {
		page.click(gPage.selectOtherGoods);
		Log.info("查看猜你喜欢");
	}
	
	//点击查看其它商品
	public void clickOtherGoods() throws InterruptedException {
		page.click(gPage.linkOtherGoods);
		Log.info("查看其他商品");
	}

	@Override
	protected void isLoaded() throws Error{
		assertTrue(page.getDriver().getTitle().contains(title));
	}
	public void quit() {
		page.getDriver().quit();
	}

}

