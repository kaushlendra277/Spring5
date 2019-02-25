/***************
@ControllerAdvice
*************/

1. This class targeted annotation is used to define reusable @ExceptionHandler(s) 
e.g.
@ControllerAdvice
public class BaseControllerExceptionHandler {
	
	@ResponseStatus(HttpStatus.NOT_FOUND) // if we don't use this status code will be 200
	@ExceptionHandler(value = NotFoundException.class)
	public ResponseEntity<Error> handleNotFoundException(Exception ex) {
		log.error(ex.getMessage());
		return ResponseEntity
				.status(HttpStatus.NOT_FOUND)
				.body(new Error(HttpStatus.NOT_FOUND, ex.getMessage()));
	}

}

2. *** As good practice always return response as ResponseEntity<T>

3. if we are using MockMvc class to define mocks then
while building MockMvc object use 
".setControllerAdvice(new BaseControllerExceptionHandler())"
as shown below

MockMvc mockMvc = MockMvcBuilders
				.standaloneSetup(controller)
				.setControllerAdvice(new BaseControllerExceptionHandler())
				.build();