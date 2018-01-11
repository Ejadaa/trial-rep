@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
      return "pushed by git";
    }

}