/***********************
XML Based Configuration
**********************/

1. Annotation
 - @ImportResource({"classpath:spring-configg.xml"}) 

2. Make sure class which is annotated as @ImportResource is scanned by spring
 
3. Example

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans.xsd">

   <!-- A simple bean definition -->
   <bean id = "." class = "...">
      <!-- collaborators and configuration for this bean go here -->
   </bean>

   <!-- A bean definition with lazy init set on -->
   <bean id = ".." class = "..." lazy-init = "true">
      <!-- collaborators and configuration for this bean go here -->
   </bean>

   <!-- A bean definition with initialization method -->
   <bean id = "..." class = "..." init-method = "...">
      <!-- collaborators and configuration for this bean go here -->
   </bean>

   <!-- A bean definition with destruction method -->
   <bean id = "...." class = "..." destroy-method = "...">
      <!-- collaborators and configuration for this bean go here -->
   </bean>

   <!-- more bean definitions go here -->
   
   <bean 
   	id = "xyzService"  
   	class="com.springframeworkconfiguration.someotherpackage.services.XYZServiceImpl"/>
   
</beans>