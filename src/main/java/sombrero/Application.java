package sombrero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    @Bean
    public String hello() {
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     *
     * 로깅 퍼사드 VS 로거
     * ● Commons Logging, SLF4j
     * ● JUL, Log4J2, Logback
     *
     *
     * 스프링 부트는 기본적으로 Commons Logging 사용.
     * Commons Logging -> SLF4j -> Logback
     * 실제 로그는 로거인 LogBack이 찍음.
     * LogBack은 SLF4j의 구현체임.
     *
     * jul, log4j를 사용한 로그를 SLF4j가 LogBack으로 보내서 로그를 남김.
     *
     * Commons Logging, SLF4j
     * 실제로 로깅을 하는 애들은 아니고 로거 API들을 추상화해놓은 인터페이스임.
     * 보통 프레임워크들은 이러한 로깅 퍼사드를 사용함. (퍼사드 패턴 참조.)
     * 보통은 Commons Logging 보다 SLF4j (simple logging facade for java) 사용.
     *
     * 로깅 퍼사드의 장점은.
     * 아래의 로거들을 바꿔껴서 사용할 수 있음.
     * JUL, Log4J2, Logback
     *
     *
     *
     * 스프링 5에 로거 관련 변경 사항
     * ● https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/overview.ht
     * ml#overview-logging
     * ● Spring-JCL (spring jakarta commons logging)
     * ○ Commons Logging -> SLF4j or Log4j2
     *  pom.xml에 exclusion 안해도 됨.
     */

    /**
     * 로그 포맷
     * 날짜 시간 로그레벨 PID [   스레드 이름] full패키지경로와 클래스명   : 메세지
     */


    /**
     * 스프링 부트 로깅
     * ● 기본 포맷
     * ● --debug (일부 핵심 라이브러리만 디버깅 모드로)
     * ● --trace (전부 다 디버깅 모드로)
     * ● 컬러 출력: spring.output.ansi.enabled
     * ● 파일 출력: logging.file 또는 logging.path
     * ● 로그 레벨 조정: logging.level.패지키 = 로그 레벨
     */


    /**
     * 커스텀 로그 설정 파일 사용하기
     * ● Logback: logback-spring.xml
     *      logback.xml은 너무 일찍 로딩이 되기 때문에
     *      스프링이 제공하는 로그 익스텐션 기능을 사용하려면 logback-spring.xml로 사용.
     * ● Log4J2: log4j2-spring.xml
     * ● JUL (비추): logging.properties
     * ● Logback extension
     * ○ 프로파일 <springProfile name=”프로파일”>
     * ○ Environment 프로퍼티 <springProperty>
     *
     *
     *
     * 로거를 Log4j2로 변경하기
     * ● https://docs.spring.io/spring-boot/docs/current/reference/html/howto-logging.html#ho
     * wto-configure-log4j-for-logging
     */

}
