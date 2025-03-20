package scd.Lab10.adapter;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/adapter")
public class AdapterController {

    @PostMapping("/process-payment")
    public String processPayment(@RequestParam String accountNumber, @RequestParam double amount) {
        OldPaymentGateway oldGateway = new OldPaymentGateway();
        NewPaymentProcessor adapter = new PaymentAdapter(oldGateway);
        return adapter.processPayment(accountNumber, amount);
    }
}
