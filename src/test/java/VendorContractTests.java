import com.codeborne.selenide.Configuration;
import lib.webElements.webElementsVendorContract;
import lib.webElements.webElementsVendorForm;
import lib.webElements.webelements;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.*;

public class VendorContractTests {
        @BeforeAll
        @DisplayName("Размер экрана 1920х1280")
        static void start() {
            Configuration.browserSize = "1920x1280";
            lib.ui.LoginPageObject.Login("9215642te", "rikb0444");
        }

    @Test
    @Tag("")
    @DisplayName("Сабмит Шага 0 без выбора чекбокса")
    void SubmitContractStep0WithotFilling(){
        //Configuration.holdBrowserOpen = true;
            webelements.mainLogo.click();
            webelements.menuVendorContract.click();
            webelements.title.shouldHave(text("Договор поставщика"));
            webelements.alert.shouldHave(text("Все данные, которые вы добавляете, автоматически вносятся в текст договора. Вам останется только распечатать его, подписать, прикрепить скан-копию и отправить его нам"));
            webElementsVendorContract.subtitleVendorContract.shouldHave(text("Ознакомьтесь с шаблоном договора поставщика:"));
            webElementsVendorContract.step0IsActive.should(exist);
            webElementsVendorContract.step0IsFinished.shouldNot(exist);
            webElementsVendorContract.labelRadiobuttonNO.shouldHave(text("У меня ещё нет договора, хочу перейти к заполнению данных для его генерации"));
            webElementsVendorContract.labelRadiobuttonYes.shouldHave(text("У меня уже есть договор, хочу перейти сразу к загрузке уставных документов"));
            //webElementsVendorContract.step2.classList.contains("ant-steps-item-finish");
            webElementsVendorContract.buttonSubmitStep0.click();
            webElementsVendorContract.radiobuttonStep0Help.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        }
    @Test
    @Tag("")
    @DisplayName("Сабмит Шага 1 без заполнения, Возврат на Шаг 0")
    void ReturnToStep0FromStep1(){
        //Configuration.holdBrowserOpen = true;
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webelements.title.shouldHave(text("Договор поставщика"));
        webelements.alert.shouldHave(text("Все данные, которые вы добавляете, автоматически вносятся в текст договора. Вам останется только распечатать его, подписать, прикрепить скан-копию и отправить его нам"));
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.subtitleVendorContract.shouldHave(text("Ознакомьтесь с шаблоном договора поставщика:"));
        webElementsVendorContract.subtitleStep1.shouldHave(text("Данные о юридическом лице"));
        webElementsVendorContract.step0IsFinished.should(exist);
        webElementsVendorContract.step1IsActive.should(exist);
        webElementsVendorContract.step1IsFinished.shouldNot(exist);
        webElementsVendorContract.buttonSubmitStep1.click();
        webElementsVendorContract.step1ManagementHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1OGRNHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1FIOSignatoryHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1PositionSignatoryHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1FIOPropsHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1PositionPropsHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1EmailHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1JuroAddressHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1FactoAddressHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1RightToSignHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1RightToSignNumberHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1BIKHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1NameBankHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1CorrespondentAccountHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1CurrentAccountHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.buttonBackStep1.click();
        webElementsVendorContract.step1IsActive.shouldNot(exist);
        webElementsVendorContract.step0IsFinished.shouldNot(exist);
        webElementsVendorContract.selectedCheckbox.shouldHave(text("У меня ещё нет договора, хочу перейти к заполнению данных для его генерации"));
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.subtitleStep1.shouldHave(text("Данные о юридическом лице"));
        webElementsVendorContract.step1ManagementHelp.shouldNot(exist);
        webElementsVendorContract.step1OGRNHelp.shouldNot(exist);
        webElementsVendorContract.step1FIOSignatoryHelp.shouldNot(exist);
        webElementsVendorContract.step1FIOSignatoryExtra.shouldHave(text("Например: Иванова Ивана Ивановича"));
        webElementsVendorContract.step1PositionSignatoryHelp.shouldNot(exist);
        webElementsVendorContract.step1PositionSignatoryExtra.shouldHave(text("Например: Руководителя отдела"));
        webElementsVendorContract.step1FIOPropsHelp.shouldNot(exist);
        webElementsVendorContract.step1FIOPropsExtra.shouldHave(text("Например: Иванов И.И."));
        webElementsVendorContract.step1PositionPropsHelp.shouldNot(exist);
        webElementsVendorContract.step1PositionPropsExtra.shouldHave(text("Например: Руководитель отдела"));
        webElementsVendorContract.step1EmailHelp.shouldNot(exist);
        webElementsVendorContract.step1JuroAddressHelp.shouldNot(exist);
        webElementsVendorContract.step1FactoAddressHelp.shouldNot(exist);
        webElementsVendorContract.step1RightToSignHelp.shouldNot(exist);
        webElementsVendorContract.step1RightToSignNumberHelp.shouldNot(exist);
        webElementsVendorContract.step1BIKHelp.shouldNot(exist);
        webElementsVendorContract.step1NameBankHelp.shouldNot(exist);
        webElementsVendorContract.step1CorrespondentAccountHelp.shouldNot(exist);
        webElementsVendorContract.step1CurrentAccountHelp.shouldNot(exist);
    }
    @Test
    @Tag("")
    @DisplayName("Переход с 0 на 4 Шаг, сабмит без заполнения, Возврат на Шаг 0")
    void ReturnToStep0FromStep4() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webelements.title.shouldHave(text("Договор поставщика"));
        webelements.alert.shouldHave(text("Все данные, которые вы добавляете, автоматически вносятся в текст договора. Вам останется только распечатать его, подписать, прикрепить скан-копию и отправить его нам"));
        webElementsVendorContract.radiobuttonStepOYes.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.step0IsActive.shouldNot(exist);
        webElementsVendorContract.step0IsFinished.should(exist);
        webElementsVendorContract.step4ActiveFromStep0.should(exist);
        webElementsVendorContract.subtitleVendorContract.shouldHave(text("Ознакомьтесь с шаблоном договора поставщика:"));
        webElementsVendorContract.step4subtitle1.should(exist);
        webElementsVendorContract.step4unit1.shouldHave(text("Загрузите подписанный и отсканированный договор в формате pdf"));
        webElementsVendorContract.step4subtitle2.should(exist);
        webElementsVendorContract.step4unit2.shouldHave(text("Загрузите устав организации в формате pdf, jpg, jpeg или png. В нем должны быть все страницы с подписью и печатью в конце документа"));
        webElementsVendorContract.step4subtitle3.should(exist);
        webElementsVendorContract.step4unit3.shouldHave(text("Загрузите актуальный протокол/решение о назначении генерального директора в формате pdf, jpg, jpeg или png"));
        webElementsVendorContract.step4subtitle4.should(exist);
        webElementsVendorContract.step4unit4.shouldHave(text("Приложите документы для каждого бренда (свидетельство на товарный знак, разрешение правообладателя на использование товарного знака, сертификат дилера или отказное письмо) в формате pdf, jpg, jpeg или png"));
        webElementsVendorContract.step4subtitle5.should(exist);
        webElementsVendorContract.step4unit5.shouldHave(text("Если договор подписывает лицо, не являющееся руководителем организации, приложите доверенность на право подписи договоров и иных документов, указанных в Договоре в формате pdf, jpg, jpeg или png"));
        webElementsVendorContract.step4subtitle6.should(exist);
        webElementsVendorContract.step4unit6.shouldHave(text("Если вы работаете по УСН, приложите декларацию за последний отчетный период с отметкой налоговой в формате pdf, jpg, jpeg или png"));
        webElementsVendorContract.step4subtitle7.should(exist);
        webElementsVendorContract.step4unit7.shouldHave(text("Если у вас есть дополнительные документы, которые вы хотите приложить к договору, прикрепите их сюда в формате png, jpg, jpeg, doc, docx, pdf"));
        webElementsVendorContract.buttonSubmitStep4.click();
        webElementsVendorContract.uploadContractHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.uploadProtocolHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.uploadRegulationsHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.uploadTradeMarkHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.buttonBackStep4.click();
        webElementsVendorContract.step0IsFinished.shouldNot(exist);
        webElementsVendorContract.step4ActiveFromStep0.shouldNot(exist);
        webElementsVendorContract.step0IsActive.should(exist);
        webElementsVendorContract.selectedCheckbox.shouldHave(text("У меня уже есть договор, хочу перейти сразу к загрузке уставных документов"));
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.step4subtitle1.should(exist);
        webElementsVendorContract.uploadContractHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadProtocolHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadRegulationsHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadTradeMarkHelpStep4.shouldNot(exist);
    }

    @Test
    @Tag("")
    @DisplayName("Сабмит Шага 1 с заполнением, Возврат на Шаг 0")
    void FillingStep1ReturnToStep0() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webelements.title.shouldHave(text("Договор поставщика"));
        webelements.alert.shouldHave(text("Все данные, которые вы добавляете, автоматически вносятся в текст договора. Вам останется только распечатать его, подписать, прикрепить скан-копию и отправить его нам"));
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.subtitleStep1.shouldHave(text("Данные о юридическом лице"));
        webElementsVendorContract.buttonSubmitStep1.click();
        webElementsVendorContract.step1ManagementHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1OGRNHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1FIOSignatoryHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1PositionSignatoryHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1FIOPropsHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1PositionPropsHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1EmailHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1JuroAddressHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1FactoAddressHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1RightToSignHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1RightToSignNumberHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1BIKHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1NameBankHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1CorrespondentAccountHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1CurrentAccountHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.managementSelectStep1.click();
        webElementsVendorContract.managementListStep1.pressEnter();
        webElementsVendorContract.step1ManagementHelp.shouldNot(exist);
        webElementsVendorContract.ogrnStep1.setValue("9876543");
        webElementsVendorContract.step1OGRNHelp.shouldNot(exist);
        webElementsVendorContract.fioSignatoryStep1.setValue("Петрова Петра Петровича");
        webElementsVendorContract.step1FIOSignatoryHelp.shouldNot(exist);
        webElementsVendorContract.step1FIOSignatoryExtra.shouldHave(text("Например: Иванова Ивана Ивановича"));
        webElementsVendorContract.positionSignatoryStep1.setValue("Руководителя территориального отделения");
        webElementsVendorContract.step1PositionSignatoryHelp.shouldNot(exist);
        webElementsVendorContract.step1PositionSignatoryExtra.shouldHave(text("Например: Руководителя отдела"));
        webElementsVendorContract.fioPropsStep1.setValue("Петров П.П.");
        webElementsVendorContract.step1FIOPropsHelp.shouldNot(exist);
        webElementsVendorContract.step1FIOPropsExtra.shouldHave(text("Например: Иванов И.И."));
        webElementsVendorContract.positionPropsStep1.setValue("Руководитель территориального отделения");
        webElementsVendorContract.step1PositionPropsHelp.shouldNot(exist);
        webElementsVendorContract.step1PositionPropsExtra.shouldHave(text("Например: Руководитель отдела"));
        webElementsVendorContract.emailStep1.setValue("tes");
        webElementsVendorContract.step1EmailHelp.shouldHave(text("Введен некорректный email"));
        webElementsVendorContract.emailStep1.setValue("t@test.ru");
        webElementsVendorContract.step1EmailHelp.shouldNot(exist);
        webElementsVendorContract.juroAddressStep1.setValue("Ленинградская область, г. Всеволожск, ул. Ленинградская, дом 5, строение FGHF, офис 34567890");
        webElementsVendorContract.factoAddressStep1.setValue("г. Санкт-Петербург, пр. Александровской фермы, дом 56, корпус АБВ, офис 678, кабинет 876");
        webElementsVendorContract.rightToSignSelectStep1.click();
        webElementsVendorContract.rightToSignListStep1.pressEnter();
        webElementsVendorContract.rightToSignSelectStep1.shouldHave(text("Устава"));
        webElementsVendorContract.rightToSignNumberStep1.shouldNot(exist);
        webElementsVendorContract.bikStep1.setValue("AБВГДЕЁЖЗ");
        webElementsVendorContract.step1BIKHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.bikStep1.setValue("345678999999");
        webElementsVendorContract.step1BIKHelp.shouldNot(exist);
        webElementsVendorContract.nameBankStep1.setValue("Северо-Западный ПАО Сбербанк России 123456");
        webElementsVendorContract.step1NameBankHelp.shouldNot(exist);
        webElementsVendorContract.correspondentAccountStep1.setValue("SDFGHJNB");
        webElementsVendorContract.step1CorrespondentAccountHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.correspondentAccountStep1.setValue("87654347");
        webElementsVendorContract.step1CorrespondentAccountHelp.shouldNot(exist);
        webElementsVendorContract.currentAccountStep1.setValue("ABCDEFG");
        webElementsVendorContract.step1CurrentAccountHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.currentAccountStep1.setValue("345678909876");
        webElementsVendorContract.step1CurrentAccountHelp.shouldNot(exist);
        webElementsVendorContract.buttonBackStep1.click();
        webElementsVendorContract.selectedCheckbox.shouldHave(text("У меня ещё нет договора, хочу перейти к заполнению данных для его генерации"));
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.managementSelectStep1.shouldHave(text("ИП на упрощённой системе налогообложения (УСН))"));
        webElementsVendorContract.ogrnStep1.shouldHave(attribute("value","9876543"));
        webElementsVendorContract.fioSignatoryStep1.shouldHave(attribute("value","Петрова Петра Петровича"));
        webElementsVendorContract.positionSignatoryStep1.shouldHave(attribute("value","Руководителя территориального отделения"));
        webElementsVendorContract.fioPropsStep1.shouldHave(attribute("value","Петров П.П."));
        webElementsVendorContract.positionPropsStep1.shouldHave(attribute("value","Руководитель территориального отделения"));
        webElementsVendorContract.emailStep1.shouldHave(attribute("value","test@test.ru"));
        webElementsVendorContract.juroAddressStep1.shouldHave(text("Ленинградская область, г. Всеволожск, ул. Ленинградская, дом 5, строение FGHF, офис 34567890"));
        webElementsVendorContract.factoAddressStep1.shouldHave(text("г. Санкт-Петербург, пр. Александровской фермы, дом 56, корпус АБВ, офис 678, кабинет 876"));
        webElementsVendorContract.rightToSignSelectStep1.shouldHave(text("Устава"));
        webElementsVendorContract.rightToSignNumberStep1.shouldNot(exist);
        webElementsVendorContract.bikStep1.shouldHave(attribute("value","345678999999"));
        webElementsVendorContract.nameBankStep1.shouldHave(attribute("value","Северо-Западный ПАО Сбербанк России 123456"));
        webElementsVendorContract.correspondentAccountStep1.shouldHave(attribute("value","87654347"));
        webElementsVendorContract.currentAccountStep1.shouldHave(attribute("value","345678909876"));
    }
    @Test
    @Tag("")
    @DisplayName("Сабмит Шага 2 без заполнения, переход на Шаг 1")
    void ReturnToStep1FromStep2() {
        Configuration.holdBrowserOpen = true;
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webelements.title.shouldHave(text("Договор поставщика"));
        webelements.alert.shouldHave(text("Все данные, которые вы добавляете, автоматически вносятся в текст договора. Вам останется только распечатать его, подписать, прикрепить скан-копию и отправить его нам"));
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.subtitleStep1.shouldHave(text("Данные о юридическом лице"));
        webElementsVendorContract.managementSelectStep1.click();
        webElementsVendorContract.managementListStep1.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.managementListStep1.pressEnter();
        webElementsVendorContract.ogrnStep1.setValue("1234567890");
        webElementsVendorContract.fioSignatoryStep1.setValue("Сидорова Петра Сидоровича");
        webElementsVendorContract.positionSignatoryStep1.setValue("Начальника территориального отделения");
        webElementsVendorContract.fioPropsStep1.setValue("Сидоров П.С.");
        webElementsVendorContract.positionPropsStep1.setValue("Начальник территориального отделения");
        webElementsVendorContract.emailStep1.setValue("test@test");
        webElementsVendorContract.step1EmailHelp.shouldHave(text("Введен некорректный email"));
        webElementsVendorContract.emailStep1.setValue(".ru");
        webElementsVendorContract.step1EmailHelp.shouldNot(exist);
        webElementsVendorContract.juroAddressStep1.setValue("Ленинградская область, г. Всеволожск, ул. Ленинградская, дом 5, строение FGHF, офис 34567890");
        webElementsVendorContract.factoAddressStep1.setValue("г. Санкт-Петербург, пр. Александровской фермы, дом 56, корпус АБВ, офис 678, кабинет 876");
        webElementsVendorContract.checkboxAddressStep1.click();
        webElementsVendorContract.checkboxAddressTitleStep1.shouldHave(text("Совпадает с юридическим адресом"));
        webElementsVendorContract.factoAddressStep1.shouldHave(text("Ленинградская область, г. Всеволожск, ул. Ленинградская, дом 5, строение FGHF, офис 34567890"));
        webElementsVendorContract.rightToSignSelectStep1.click();
        webElementsVendorContract.rightToSignListStep1.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.rightToSignListStep1.pressEnter();
        webElementsVendorContract.rightToSignSelectStep1.shouldHave(text("Доверенности"));
        webElementsVendorContract.rightToSignNumberStep1.setValue("23456_ABCDEFG/123");
        webElementsVendorContract.rightToSignDateStep1.click();
        webElementsVendorContract.rightToSignNumberOfDayStep1.click();
        String fullDateTwoDaysAgo = lib.ui.MainPageObject.GetFullDateTwoDaysAgo();
        webElementsVendorContract.rightToSignDateStep1.shouldHave(attribute("value", fullDateTwoDaysAgo));
        webElementsVendorContract.bikStep1.setValue("8765432");
        webElementsVendorContract.nameBankStep1.setValue("Северо-Западный ПАО Сбербанк России 123456");
        webElementsVendorContract.correspondentAccountStep1.setValue("98765432123456");
        webElementsVendorContract.currentAccountStep1.setValue("345678909876456");
        webElementsVendorContract.buttonSubmitStep1.click();
        webElementsVendorContract.step0IsFinished.should(exist);
        webElementsVendorContract.step1IsFinished.should(exist);
        webElementsVendorContract.step1IsActive.shouldNot(exist);
        webElementsVendorContract.step2IsActive.should(exist);
        webElementsVendorContract.buttonSubmitStep2.click();
        webElementsVendorContract.step2DefermentHelp1.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2DefermentHelp2.shouldHave(text("Может принимать только целое значение до 999"));
        webElementsVendorContract.step2ProductGroupHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2NameOfProductHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2DiscountHelp1.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2DiscountHelp2.shouldHave(text("Может принимать значение от 0 до 100"));
        webElementsVendorContract.buttonBackStep2.click();
        webElementsVendorContract.step1IsActive.should(exist);
        webElementsVendorContract.step1IsFinished.shouldNot(exist);
        webElementsVendorContract.step2IsActive.shouldNot(exist);
        webElementsVendorContract.ogrnStep1.shouldHave(attribute("value","1234567890"));
        webElementsVendorContract.fioSignatoryStep1.shouldHave(attribute("value","Сидорова Петра Сидоровича"));
        webElementsVendorContract.positionSignatoryStep1.shouldHave(attribute("value","Начальника территориального отделения"));
        webElementsVendorContract.fioPropsStep1.shouldHave(attribute("value","Сидоров П.С."));
        webElementsVendorContract.positionPropsStep1.shouldHave(attribute("value","Начальник территориального отделения"));
        webElementsVendorContract.emailStep1.shouldHave(attribute("value","test@test.ru"));
        webElementsVendorContract.juroAddressStep1.shouldHave(text("Ленинградская область, г. Всеволожск, ул. Ленинградская, дом 5, строение FGHF, офис 34567890"));
        webElementsVendorContract.factoAddressStep1.shouldHave(text("Ленинградская область, г. Всеволожск, ул. Ленинградская, дом 5, строение FGHF, офис 34567890"));
        webElementsVendorContract.checkboxAddressIsCheckedStep1.should(exist);
        webElementsVendorContract.rightToSignSelectStep1.shouldHave(text("Доверенности"));
        webElementsVendorContract.rightToSignNumberStep1.shouldHave(attribute("value","23456_ABCDEFG/123"));
        webElementsVendorContract.rightToSignDateStep1.shouldHave(attribute("value", fullDateTwoDaysAgo));
        webElementsVendorContract.bikStep1.shouldHave(attribute("value","8765432"));
        webElementsVendorContract.nameBankStep1.shouldHave(attribute("value","Северо-Западный ПАО Сбербанк России 123456"));
        webElementsVendorContract.correspondentAccountStep1.setValue("98765432123456");
        webElementsVendorContract.currentAccountStep1.shouldHave(attribute("value","345678909876456"));
        webElementsVendorContract.buttonSubmitStep1.click();
        webElementsVendorContract.step2DefermentHelp1.shouldNot(exist);
        webElementsVendorContract.step2DefermentHelp2.shouldNot(exist);
        webElementsVendorContract.step2ProductGroupHelp.shouldNot(exist);
        webElementsVendorContract.step2NameOfProductHelp.shouldNot(exist);
        webElementsVendorContract.step2DiscountHelp1.shouldNot(exist);
        webElementsVendorContract.step2DiscountHelp2.shouldNot(exist);

        }
}
