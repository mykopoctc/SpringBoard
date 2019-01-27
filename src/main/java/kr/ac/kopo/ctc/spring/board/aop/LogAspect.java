package kr.ac.kopo.ctc.spring.board.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);
	
	@Before("execution(* kr.ac.kopo.ctc.spring.board.service.*.*Aop(..))")
	public void onBeforeHandler(JoinPoint joinPoint) {
		logger.info("=============== onBeforeThing");
	}
	
	@After("execution(* kr.ac.kopo.ctc.spring.board.service.*.*Aop(..))")
	public void onAfterHandler(JoinPoint joinPoint) {
		logger.info("=============== onAfterHandler");
	}
	
	@AfterReturning(pointcut = "execution(* kr.ac.kopo.ctc.spring.board.service.*.*Aop(..))", returning = "str")
	public void onAfterReturningHandler(JoinPoint joinPoint, Object str) {
		logger.info("@AfterReturning : " + str);
		logger.info("=============== onAfterReturningHandler");
	}
	
	@Pointcut("execution(* kr.ac.kopo.ctc.spring.board.service.*.*Aop(..))")
	public void onPointcut(JoinPoint joinPoint) {
		logger.info("=============== onPointcut");
	}
}
