package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    //인터페이스에만 의존하는 코드(DIP준수)
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    //회원  찾아야 함
    //--------------------------DIP위반 코드-------------------------------//
    //할인 적용여부를 확인해야 함 - 정액할인을 정의한 객체
    //1 - 고정할인 금액에 사용한 구현체 new FixDiscountPolicy();
    //private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    //2-  정률할인으로 변경!
    //private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    //--------------------------DIP위반 코드-------------------------------//

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        //주문이 들어오면 회원 정보를 가장 먼저 조회하고
        Member member = memberRepository.findById(memberId);

        //할일정책 객체에 회원을 넘겨준다. - (Grade or Member중 택)
        //최종 할인 가격을 넘겨 받았다.
        int discountPrice = discountPolicy.discount(member, itemPrice);

        //최종으로 생성된 주문을 반환
        return new Order(memberId,itemName,itemPrice,discountPrice);
    }

}