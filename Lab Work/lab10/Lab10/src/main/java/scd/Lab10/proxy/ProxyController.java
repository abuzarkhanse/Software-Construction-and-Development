package scd.Lab10.proxy;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/proxy")
public class ProxyController {

    @GetMapping("/document")
    public String accessDocument(@RequestParam boolean isAdmin) {
        Document document = new DocumentProxy("Secret Report", isAdmin);
        return document.display();
    }
}
