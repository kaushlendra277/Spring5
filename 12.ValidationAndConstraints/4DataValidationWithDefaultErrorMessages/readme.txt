/***************
@ModelValidation
*************/
 
@RestController
@RequestMapping("/")
@Slf4j
public class StudentController {

	// Method1
	@PostMapping("post")
	public ResponseEntity<Student> createStudent(@Valid @RequestBody Student student){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(student);
	}
	
	// Method2
	@PostMapping("post/debug")
	public ResponseEntity<Student> createStudent(
			@Valid @RequestBody Student student, 
			BindingResult bindingResult){
		bindingResult.getAllErrors().forEach(pojoError ->{
			log.error(pojoError.toString());
		});
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(student);
	}
}
1.
#########Method2
If with @Valid we also used BindingResult(method 2) as createStudent(
													@Valid @RequestBody Student student, 
													BindingResult bindingResult)
	then spring do not throw model binding failure, it binds invalid model as passed and give control
	to the programmer to do as per the use case

2.
#########Method1
If with @Valid we dont use  BindingResult(method 1) as createStudent(@Valid @RequestBody Student student)
	then spring throws model binding failure as bad request, and returns internally constructed 
	BindingResult instance
