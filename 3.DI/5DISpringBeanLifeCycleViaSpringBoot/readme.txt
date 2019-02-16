/**************
Spring Bean Life Cycle
***********/

Step 1: Bean Constructor
Step 2: setBeanName() of BeanNameAware(I)
Step 3: setBeanFactory() of BeanFactoryAware(I)
Step 4: setApplicationContext() of ApplicationContextAware(I)
Step 5: postProcessBeforeInitialixation of BeanPostProcessor(I)---- ?
Step 6 : @PostConstruct annotated method
Step 7: afterPropertiesSet() of InitializingBean(I)
Step 8: postProcessAfterInitialixation of BeanPostProcessor(I) -----?
Step 9 : @PreDestroy annotated method
Step 10: destroy() of DisposableBean(I)

Ques - How can we execute BeanPostProcessor(I) method ?