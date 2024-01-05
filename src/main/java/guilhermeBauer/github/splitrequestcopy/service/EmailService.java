package guilhermeBauer.github.splitrequestcopy.service;

import guilhermeBauer.github.splitrequestcopy.model.NotificationEmail;
import guilhermeBauer.github.splitrequestcopy.service.contract.EmailServiceContract;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailService implements EmailServiceContract {

    private static final String EMAIL_TEMPLATE = "email";
    private final SendE
    @Override
    public void sendPaymentEmail(NotificationEmail notificationEmail) {

    }

    @Override
    public void sendEmail(NotificationEmail data) {

    }
}
