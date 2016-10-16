package arabicStar.dataservice.promotiondataservice;

import arabicStar.data.promotiondata.IPromotionData;
import arabicStar.util.promotion.Promotion;

/**
 * 这是Promotion的数据接口方法实现
 * @author Vivian
 *
 */
public class PromotionDataService implements IPromotionData {

	/**
	 * 获取促销策略信息
	 * @return 返回促销策略名称与介绍
	 */
	@Override
	public Promotion getDiscription() {
		// TODO Auto-generated method stub
		System.out.println("获取描述成功");
		return null;
	}

}