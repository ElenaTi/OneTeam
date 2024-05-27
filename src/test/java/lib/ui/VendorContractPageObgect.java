package lib.ui;

import lib.webElements.webElementsVendorContract;
import lib.webElements.webelements;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;

public class VendorContractPageObgect {
    public static void OpenVendorContractPage(){
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
    }
    public static void CheckVendorContractHeader(){
        webelements.title.shouldHave(text("Договор поставщика"));
        webelements.alert.shouldHave(text("Все данные, которые вы добавляете, автоматически вносятся в текст договора. Вам останется только распечатать его, подписать, прикрепить скан-копию и отправить его нам"));
        webElementsVendorContract.subtitleVendorContract.shouldHave(text("Ознакомьтесь с шаблоном договора поставщика:"));
        webElementsVendorContract.linksToTemplateContract.shouldHave(text("Договор поставщика"));
        webElementsVendorContract.linksToTemplateRules.shouldHave(text("Общие правила взаимодействия"));
        webElementsVendorContract.linksToTemplateApplication1.shouldHave(text("Приложение 1 Протокол согласования скидок и отсрочки"));
        webElementsVendorContract.linksToTemplateApplication2.shouldHave(text("Приложение 2 Соглашение об ИВП"));
        webElementsVendorContract.linksToTemplateAgreementOneTeam.shouldHave(text("Соглашение об использовании сервиса iPRO OneTeam"));
    }
    public static void SubmitStep0ToStep1(){
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webelements.title.shouldHave(text("Договор поставщика"));
        webelements.alert.shouldHave(text("Все данные, которые вы добавляете, автоматически вносятся в текст договора. Вам останется только распечатать его, подписать, прикрепить скан-копию и отправить его нам"));
        webElementsVendorContract.subtitleVendorContract.shouldHave(text("Ознакомьтесь с шаблоном договора поставщика:"));
        webElementsVendorContract.linksToTemplateContract.shouldHave(text("Договор поставщика"));
        webElementsVendorContract.linksToTemplateRules.shouldHave(text("Общие правила взаимодействия"));
        webElementsVendorContract.linksToTemplateApplication1.shouldHave(text("Приложение 1 Протокол согласования скидок и отсрочки"));
        webElementsVendorContract.linksToTemplateApplication2.shouldHave(text("Приложение 2 Соглашение об ИВП"));
        webElementsVendorContract.linksToTemplateAgreementOneTeam.shouldHave(text("Соглашение об использовании сервиса iPRO OneTeam"));
    }
    public static void SubmitStep0ToStep4(){
        webElementsVendorContract.radiobuttonStepOYes.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webelements.title.shouldHave(text("Договор поставщика"));
        webelements.alert.shouldHave(text("Все данные, которые вы добавляете, автоматически вносятся в текст договора. Вам останется только распечатать его, подписать, прикрепить скан-копию и отправить его нам"));
        webElementsVendorContract.subtitleVendorContract.shouldHave(text("Ознакомьтесь с шаблоном договора поставщика:"));
        webElementsVendorContract.linksToTemplateContract.shouldHave(text("Договор поставщика"));
        webElementsVendorContract.linksToTemplateRules.shouldHave(text("Общие правила взаимодействия"));
        webElementsVendorContract.linksToTemplateApplication1.shouldHave(text("Приложение 1 Протокол согласования скидок и отсрочки"));
        webElementsVendorContract.linksToTemplateApplication2.shouldHave(text("Приложение 2 Соглашение об ИВП"));
        webElementsVendorContract.linksToTemplateAgreementOneTeam.shouldHave(text("Соглашение об использовании сервиса iPRO OneTeam"));
    }
    public static void FillingStep1(){
        webElementsVendorContract.ogrnStep1.setValue("9876543");
        webElementsVendorContract.fioSignatoryStep1.setValue("Петрова Петра Петровича");
        webElementsVendorContract.positionSignatoryStep1.setValue("Руководителя территориального отделения");
        webElementsVendorContract.fioPropsStep1.setValue("Петров П.П.");
        webElementsVendorContract.positionPropsStep1.setValue("Руководитель территориального отделения");
        webElementsVendorContract.managementSelectStep1.click();
        webElementsVendorContract.managementListStep1.pressEnter();
        webElementsVendorContract.emailStep1.setValue("test@test.ru");
        webElementsVendorContract.juroAddressStep1.setValue("Ленинградская область, г. Всеволожск, ул. Ленинградская, дом 5, строение FGHF, офис 34567890");
        webElementsVendorContract.factoAddressStep1.setValue("г. Санкт-Петербург, пр. Александровской фермы, дом 56, корпус АБВ, офис 678, кабинет 876");
        webElementsVendorContract.rightToSignSelectStep1.click();
        webElementsVendorContract.rightToSignListStep1.pressEnter();
        webElementsVendorContract.bikStep1.setValue("345678999999");
        webElementsVendorContract.nameBankStep1.setValue("Северо-Западный ПАО Сбербанк России 123456");
        webElementsVendorContract.correspondentAccountStep1.setValue("87654347");
        webElementsVendorContract.currentAccountStep1.setValue("345678909876");
    }
    public static void SubmitStep1(){
        webElementsVendorContract.buttonSubmitStep1.click();
        webElementsVendorContract.step2IsActive.should(exist);
        webelements.title.shouldHave(text("Договор поставщика"));
        webelements.alert.shouldHave(text("Все данные, которые вы добавляете, автоматически вносятся в текст договора. Вам останется только распечатать его, подписать, прикрепить скан-копию и отправить его нам"));
        webElementsVendorContract.subtitleVendorContract.shouldHave(text("Ознакомьтесь с шаблоном договора поставщика:"));
        webElementsVendorContract.linksToTemplateContract.shouldHave(text("Договор поставщика"));
        webElementsVendorContract.linksToTemplateRules.shouldHave(text("Общие правила взаимодействия"));
        webElementsVendorContract.linksToTemplateApplication1.shouldHave(text("Приложение 1 Протокол согласования скидок и отсрочки"));
        webElementsVendorContract.linksToTemplateApplication2.shouldHave(text("Приложение 2 Соглашение об ИВП"));
        webElementsVendorContract.linksToTemplateAgreementOneTeam.shouldHave(text("Соглашение об использовании сервиса iPRO OneTeam"));
    }
    public static void FillingStep2(){
        webElementsVendorContract.defermentStep2.setValue("102");
        webElementsVendorContract.groupStep2.setValue("Электрические товары");
        webElementsVendorContract.nameStep2.setValue("Светильник потолочный 109768");
        webElementsVendorContract.discountStep2.setValue("10,1");
    }
    public static void SubmitStep2(){
        webElementsVendorContract.buttonSubmitStep2.click();
        webElementsVendorContract.step0IsFinished.should(exist);
        webElementsVendorContract.step3IsActive.should(exist);
        webelements.title.shouldHave(text("Договор поставщика"));
        webelements.alert.shouldHave(text("Все данные, которые вы добавляете, автоматически вносятся в текст договора. Вам останется только распечатать его, подписать, прикрепить скан-копию и отправить его нам"));
        webElementsVendorContract.subtitleVendorContract.shouldHave(text("Ознакомьтесь с шаблоном договора поставщика:"));
        webElementsVendorContract.linksToTemplateContract.shouldHave(text("Договор поставщика"));
        webElementsVendorContract.linksToTemplateRules.shouldHave(text("Общие правила взаимодействия"));
        webElementsVendorContract.linksToTemplateApplication1.shouldHave(text("Приложение 1 Протокол согласования скидок и отсрочки"));
        webElementsVendorContract.linksToTemplateApplication2.shouldHave(text("Приложение 2 Соглашение об ИВП"));
        webElementsVendorContract.linksToTemplateAgreementOneTeam.shouldHave(text("Соглашение об использовании сервиса iPRO OneTeam"));
    }
    public static void FillingLine2OnStep2(){
        webElementsVendorContract.groupLine2Step2.setValue("Товарная группа номер 2");
        webElementsVendorContract.nameLine2Step2.setValue("Наименование товара из товарной группы номер 2");
        webElementsVendorContract.discountLine2Step2.setValue("0.9");
    }

}
