package samples;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import nextstep.mvc.controller.asis.Controller;

public class RegisterController implements Controller {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        return "redirect:/index.jsp";
    }
}
