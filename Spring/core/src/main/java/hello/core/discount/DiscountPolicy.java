package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    // 000원이 할인 됐다는 것을 return
    int discount(Member member,int price);


}
