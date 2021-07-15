package hello.core;


import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) // 일반적으로는 exclude 사용하지 않는데, 기존 예제코드에 configuration이 남아있어서, (예제코드 살리려고 그냥 제외시킴)
public class AutoAppConfig {

//    @Bean(name = "memoryMemberRepository") // 수동 빈 등록과 자동 빈 등록의 이름이 똑같을 때, 수동 등록이 우선권을 가진다.
//    public MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//    }
}
