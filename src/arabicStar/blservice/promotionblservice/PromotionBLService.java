package arabicStar.blservice.promotionblservice;

import arabicStar.bl.promotionbl.PromotionBL;
import arabicStar.util.order.Order;

/**
 * 这是Promotion的逻辑接口方法实现
 * @author Vivian
 *
 */
public class PromotionBLService implements PromotionBL {

	/**
	 * 将传入的订单经过促销策略装饰再次返回
	 * @return 返回打过折的订单
	 * TODO: 传入初始订单
	 */
	@Override
	public Order apply(Order order) {
		// TODO Auto-generated method stub
		System.out.println("策略应用成功");
		return null;
	}

}
