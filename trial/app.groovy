@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
      return "pushed by new in git";
    }

}