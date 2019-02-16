/***********************
Java Based Configuration
**********************/

1. Annotation
 - @Configuration
 - @Bean

2. Make sure class which is annotated as @Configuration is scanned by spring
 
3. Example

@Configuration
public class XYZConfig {

	@Bean
	// in such cases bean "xyzService" will be created first supprted by spring 5
	// in earlier version use @DependsOn("xyzService")
	public XYZComponent xyzComponent(XYZService xyzService) {
		return new XYZComponent(xyzService);
	}
	
	@Bean
	public XYZService xyzService() {
		return new XYZServiceImpl();
	}
}