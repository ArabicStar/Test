package arabicStar.blServiceImpl.memberBLServiceImpl;

import java.util.Random;

import arabicStar.blService.memberBLService.MemberLogicService;
import arabicStar.blService.orderBLService.OrderLogicService;
import arabicStar.blService.promotionBLService.PromotionLogicService;
import arabicStar.vo.CreditChangeVO;
import arabicStar.vo.MemberVO;
import arabicStar.vo.OrderVO;

public class MemberLogicServiceImpl_Stub implements MemberLogicService {
	private Random idRandom;
	private OrderLogicService orderBL;
	private PromotionLogicService promotionBL;

	public MemberLogicServiceImpl_Stub(OrderLogicService orderBL, PromotionLogicService promotionBL) {
		idRandom = new Random();
		this.orderBL = orderBL;
		this.promotionBL = promotionBL;
	}

	@Override
	public MemberVO getMemberInfo(String id) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public CreditChangeVO[] getCreditChanges(String id) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public OrderVO[] getOrderHistory(String id) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean updateInfo(MemberVO info) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean login(MemberVO member) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean register(MemberVO member) {
		idRandom.nextInt(10000000);
		return false;
	}

}
