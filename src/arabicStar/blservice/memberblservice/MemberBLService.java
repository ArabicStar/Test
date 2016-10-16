package arabicStar.blservice.memberblservice;

import arabicStar.bl.memberbl.MemberBL;
import arabicStar.vo.ContactVO;
import arabicStar.vo.MemberVO;
import arabicStar.vo.ResultMessage;

public class MemberBLService implements MemberBL {

	@Override
	public ResultMessage updateInfo(MemberVO info) {
		System.out.println("Update Info success!");
		return new ResultMessage();
	}

	@Override
	public String getName() {
		return "Jack";
	}

	@Override
	public ContactVO getContact() {
		System.out.println("Acquiring contact info");
		return new ContactVO();
	}

	@Override
	public ResultMessage updateCredit(int increment) {
		System.out.println("Credit gain!");
		return new ResultMessage();
	}
	
	@Override
	public int getCredit() {
		return 100;
	}

}
