package micromath;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/math")
public class MathController {

    @Get("/doMath/{x}/{y}")
    public MathResult mathItUp(int x, int y) {
        return new MathResult(x, y);
    }
}
