import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import lib.webElements.webElementsVendorContract;
import lib.webElements.webelements;
import org.checkerframework.checker.units.qual.K;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.*;

public class VendorContractTestsZeroFirstSteps {

    @BeforeAll
    @DisplayName("Размер экрана 1920х1280")
    static void start() {
        //Configuration.browser = "firefox";
        //Configuration.browser = "edge";
        Configuration.browserSize = "1920x1280";
        lib.ui.LoginPageObject.Login("9215642te", "rikb0444");
    }


    @Test
    @Tag("TMOT-342")
    @DisplayName("Проверка отображения Шага 0")
    void CheckDisplayStep0() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webelements.title.shouldHave(text("Договор поставщика"));
        webelements.alert.shouldHave(text("Все данные, которые вы добавляете, автоматически вносятся в текст договора. Вам останется только распечатать его, подписать, прикрепить скан-копию и отправить его нам"));
        webElementsVendorContract.subtitleVendorContract.shouldHave(text("Ознакомьтесь с шаблоном договора поставщика:"));
        webElementsVendorContract.linksToTemplateContract.shouldHave(text("Договор поставщика"));
        webElementsVendorContract.linksToTemplateRules.shouldHave(text("Общие правила взаимодействия"));
        webElementsVendorContract.linksToTemplateApplication1.shouldHave(text("Приложение 1 Протокол согласования скидок и отсрочки"));
        webElementsVendorContract.linksToTemplateApplication2.shouldHave(text("Приложение 2 Соглашение об ИВП"));
        webElementsVendorContract.linksToTemplateAgreementOneTeam.shouldHave(text("Соглашение об использовании сервиса iPRO OneTeam"));
        webElementsVendorContract.step0IsActive.should(exist);
        webElementsVendorContract.step0IsFinished.shouldNot(exist);
        webElementsVendorContract.labelRadiobuttonNO.shouldHave(text("У меня ещё нет договора, хочу перейти к заполнению данных для его генерации"));
        webElementsVendorContract.labelRadiobuttonYes.shouldHave(text("У меня уже есть договор, хочу перейти сразу к загрузке уставных документов"));
        webElementsVendorContract.buttonSubmitStep0.should(exist);
    }

    @Test
    @Tag("TMOT-335")
    @DisplayName("Сабмит Шага 0 без выбора чекбокса")
    void SubmitContractStep0WithotFilling() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webelements.title.shouldHave(text("Договор поставщика"));
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.radiobuttonStep0Help.shouldHave(text("Пожалуйста, заполните обязательное поле"));
    }
    @Test
    @Tag("TMOT-343")
    @DisplayName("Сабмит Шага 0, выбор радиобаттона Нет")
    void SubmitContractStep0ChoiseNo() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.subtitleStep1.shouldHave(text("Данные о юридическом лице"));
        webElementsVendorContract.step0IsFinished.should(exist);
        webElementsVendorContract.step1IsActive.should(exist);
    }
    @Test
    @Tag("TMOT-344")
    @DisplayName("Сабмит Шага 0, выбор радиобаттона Да")
    void SubmitContractStep0ChoiceYes() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepOYes.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.step0IsActive.shouldNot(exist);
        webElementsVendorContract.step0IsFinished.should(exist);
        webElementsVendorContract.step4ActiveFromStep0.should(exist);
    }

    @Test
    @Tag("TMOT-345")
    @DisplayName("Проверка сброса радиобаттона на шаге 0 после перехода в другой раздел")
    void ChoiceRadiobuttonTransition() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepOYes.click();
        webelements.menuVendorForm.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.radiobuttonStep0Help.shouldHave(text("Пожалуйста, заполните обязательное поле"));
    }
    @Test
    @Tag("TMOT-346")
    @DisplayName("Проверка отображения Шага 1")
    void DisplayStep1() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
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
        webElementsVendorContract.step0IsFinished.should(exist);
        webElementsVendorContract.step1IsActive.should(exist);
        webElementsVendorContract.subtitleStep1.shouldHave(text("Данные о юридическом лице"));
        webElementsVendorContract.managementTitleSelectStep1.shouldHave(attribute("title", "Форма правления"));
        webElementsVendorContract.ogrnTitleStep1.shouldHave(attribute("title","ОГРН"));
        webElementsVendorContract.orgNameTitleStep1.shouldHave(attribute("title","Название юр.лица"));
        webElementsVendorContract.orgNameInputStep1.shouldNotBe(empty);
        webElementsVendorContract.innTitleStep1.shouldHave(attribute("title","ИНН"));
        webElementsVendorContract.innInputStep1.shouldNotBe(empty);
        webElementsVendorContract.kppTitleStep1.shouldHave(attribute("title","КПП"));
        webElementsVendorContract.fioSignatoryTitleStep1.shouldHave(attribute("title","ФИО подписанта (в родительном падеже)"));
        webElementsVendorContract.step1FIOSignatoryExtra.shouldHave(text("Например: Иванова Ивана Ивановича"));
        webElementsVendorContract.positionSignatoryTitleStep1.shouldHave(attribute("title","Должность подписанта (в родительном падеже)"));
        webElementsVendorContract.step1PositionSignatoryExtra.shouldHave(text("Например: Руководителя отдела"));
        webElementsVendorContract.fioPropsTitleStep1.shouldHave(attribute("title","ФИО (для реквизитов)"));
        webElementsVendorContract.step1FIOPropsExtra.shouldHave(text("Например: Иванов И.И."));
        webElementsVendorContract.positionPropsTitleStep1.shouldHave(attribute("title","Должность (для реквизитов)"));
        webElementsVendorContract.step1PositionPropsExtra.shouldHave(text("Например: Руководитель отдела"));
        webElementsVendorContract.emailTitleStep1.shouldHave(attribute("title","Email (для реквизитов)"));
        webElementsVendorContract.juroAddressTitleStep1.shouldHave(attribute("title","Юридический адрес"));
        webElementsVendorContract.factoAddressTitleStep1.shouldHave(attribute("title","Фактический адрес"));
        webElementsVendorContract.checkboxAddressTitleStep1.shouldHave(text("Совпадает с юридическим адресом"));
        webElementsVendorContract.rightToSignTitleStep1.shouldHave(attribute("title","Право подписи на основании"));
        webElementsVendorContract.rightToSignNumberTitleStep1.shouldHave(attribute("title","Номер"));
        webElementsVendorContract.bikTitleStep1.shouldHave(attribute("title","БИК"));
        webElementsVendorContract.nameBankTitleStep1.shouldHave(attribute("title","Наименование банка"));
        webElementsVendorContract.correspondentAccountTitleStep1.shouldHave(attribute("title","Корреспондентский счёт"));
        webElementsVendorContract.currentAccountTitleStep1.shouldHave(attribute("title","Расчётный счёт"));
        webElementsVendorContract.buttonSubmitStep1.should(exist);
        webElementsVendorContract.buttonBackStep1.should(exist);
    }
    @Test
    @Tag("TMOT-347")
    @DisplayName("Радиобаттон Нет выбран после возврата с шага 1 на шаг 0")
    void CheckingCheckboxAfterReturnBackToStep0FromStep1() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.buttonBackStep1.click();
        webElementsVendorContract.selectedCheckbox.shouldHave(text("У меня ещё нет договора, хочу перейти к заполнению данных для его генерации"));
    }
    @Test
    @Tag("TMOT-348")
    @DisplayName("Радиобаттон выбран после возврата с шага 4 на шаг 0")
    void CheckingCheckboxAfterReturnBackToStep0FromStep4() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepOYes.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.buttonBackStep4.click();
        webElementsVendorContract.selectedCheckbox.shouldHave(text("У меня уже есть договор, хочу перейти сразу к загрузке уставных документов"));
    }

    @Test
    @Tag("TMOT-336")
    @DisplayName("Сабмит Шага 1 без заполнения")
    void SubmitStep1WithoutFilling() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
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
    }

    @Test
    @Tag("TMOT-349")
    @DisplayName("Сброс ошибок валидации под полями шага 1 после перехода на шаг 0 и назад")
    void ReturnToStep0FromStep1() throws InterruptedException{
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.buttonSubmitStep1.click();
        webElementsVendorContract.step1ManagementHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.buttonBackStep1.click();
        Thread.sleep(200);
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.step1ManagementHelp.shouldNot(exist);
        webElementsVendorContract.step1OGRNHelp.shouldNot(exist);
        webElementsVendorContract.step1FIOSignatoryHelp.shouldNot(exist);
        webElementsVendorContract.step1PositionSignatoryHelp.shouldNot(exist);
        webElementsVendorContract.step1FIOPropsHelp.shouldNot(exist);
        webElementsVendorContract.step1PositionPropsHelp.shouldNot(exist);
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
    @Tag("TMOT-350")
    @DisplayName("Проверка заполнения поля Email латиницей на Шаге 1 ")
    void CheckingInputEmailWithLatinitsaStep1() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.buttonSubmitStep1.click();
        webElementsVendorContract.emailStep1.setValue("tes");
        webElementsVendorContract.step1EmailHelp.shouldHave(text("Введен некорректный email"));
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.setValue("test@test");
        webElementsVendorContract.step1EmailHelp.shouldHave(text("Введен некорректный email"));
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.setValue("test@test.ru");
        webElementsVendorContract.step1EmailHelp.shouldNot(exist);
    }
    @Test
    @Tag("TMOT-351")
    @DisplayName("Проверка заполнения поля Email кириллицей")
    void CheckingInputEmailWithKirillitsaStep1() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.buttonSubmitStep1.click();
        webElementsVendorContract.emailStep1.setValue("те");
        webElementsVendorContract.step1EmailHelp.shouldHave(text("Введен некорректный email"));
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.setValue("тест@те");
        webElementsVendorContract.step1EmailHelp.shouldHave(text("Введен некорректный email"));
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.emailStep1.setValue("тест@тест.рф");
        webElementsVendorContract.step1EmailHelp.shouldNot(exist);
    }
    @Test
    @Tag("TMOT-352")
    @DisplayName("Проверка состояний поля Право подписи на основании и зависимых полей")
    void CheckingRightToSign() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.rightToSignSelectStep1.click();
        webElementsVendorContract.rightToSignListStep1.pressEnter();
        webElementsVendorContract.rightToSignSelectStep1.shouldHave(text("Устава"));
        webElementsVendorContract.rightToSignNumberStep1.shouldNot(exist);
        webElementsVendorContract.rightToSignDateStep1.shouldNot(exist);
        webElementsVendorContract.rightToSignSelectStep1.click();
        webElementsVendorContract.rightToSignListStep1.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.rightToSignListStep1.pressEnter();
        webElementsVendorContract.rightToSignSelectStep1.shouldHave(text("Доверенности"));
        webElementsVendorContract.rightToSignNumberStep1.should(exist);
        webElementsVendorContract.rightToSignDateStep1.should(exist);
        webElementsVendorContract.rightToSignSelectStep1.click();
        webElementsVendorContract.rightToSignListStep1.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.rightToSignListStep1.pressEnter();
        webElementsVendorContract.rightToSignSelectStep1.shouldHave(text("ОГРНИП"));
        webElementsVendorContract.rightToSignNumberStep1.should(exist);
        webElementsVendorContract.rightToSignDateStep1.shouldNot(exist);
        webElementsVendorContract.rightToSignSelectStep1.click();
        webElementsVendorContract.rightToSignListStep1.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.rightToSignListStep1.pressEnter();
        webElementsVendorContract.rightToSignSelectStep1.shouldHave(text("Листа записи"));
        webElementsVendorContract.rightToSignNumberStep1.should(exist);
        webElementsVendorContract.rightToSignDateStep1.shouldNot(exist);
    }
    @Test
    @Tag("TMOT-353")
    @DisplayName("Активация Чекбокса адресов без заполнения полей, заполнение юр.адреса с активным чекбоксом")
    void ActivateCheckboxAddressWithoutFillingStep1() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.checkboxAddressStep1.click();
        webElementsVendorContract.step1JuroAddressHelp.shouldNot(exist);
        webElementsVendorContract.step1FactoAddressHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.checkboxAddressStep1.click();
        webElementsVendorContract.step1JuroAddressHelp.shouldNot(exist);
        webElementsVendorContract.step1FactoAddressHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.checkboxAddressStep1.click();
        webElementsVendorContract.juroAddressStep1.setValue("Ленинградская область, г. Всеволожск, ул. Ленинградская, дом 5, строение FGHF, офис 34567890");
        webElementsVendorContract.juroAddressStep1.shouldHave(text("Ленинградская область, г. Всеволожск, ул. Ленинградская, дом 5, строение FGHF, офис 34567890"));
        webElementsVendorContract.factoAddressStep1.shouldHave(text("Ленинградская область, г. Всеволожск, ул. Ленинградская, дом 5, строение FGHF, офис 34567890"));
    }
    @Test
    @Tag("TMOT-354")
    @DisplayName("Активация Чекбокса после заполнения фактического адреса")
    void TestCheckboxWithAddressesStep1() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.juroAddressStep1.setValue("Ленинградская область, г. Всеволожск, ул. Ленинградская, дом 5, строение FGHF, офис 34567890");
        webElementsVendorContract.factoAddressStep1.setValue("г. Санкт-Петербург, пр. Александровской фермы, дом 56, корпус АБВ, офис 678, кабинет 876");
        webElementsVendorContract.checkboxAddressStep1.click();
        webElementsVendorContract.factoAddressStep1.shouldHave(text("Ленинградская область, г. Всеволожск, ул. Ленинградская, дом 5, строение FGHF, офис 34567890"));
    }
    @Test
    @Tag("TMOT-355")
    @DisplayName("Проверка заполнения поля БИК")
    void CheckingInputBIKStep1() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.buttonSubmitStep1.click();
        webElementsVendorContract.bikStep1.setValue("ABCDEFG");
        webElementsVendorContract.step1BIKHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.nameBankStep1.click();
        webElementsVendorContract.bikStep1.shouldBe(empty);
        webElementsVendorContract.bikStep1.setValue("ABCDEFG567890-");
        webElementsVendorContract.step1BIKHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.nameBankStep1.click();
        webElementsVendorContract.bikStep1.shouldBe(empty);
        webElementsVendorContract.bikStep1.setValue("34-=");
        webElementsVendorContract.step1BIKHelp.shouldNot(exist);
        webElementsVendorContract.nameBankStep1.click();
        webElementsVendorContract.bikStep1.shouldHave(attribute("value", "34"));
        webElementsVendorContract.bikStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.bikStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.bikStep1.setValue("345678999999");
        webElementsVendorContract.step1BIKHelp.shouldNot(exist);
        webElementsVendorContract.bikStep1.shouldHave(attribute("value", "345678999999"));
    }
    @Test
    @Tag("TMOT-356")
    @DisplayName("Проверка заполнения поля Корреспондентский счёт")
    void CheckingInputCorrespondentAccountStep1() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.buttonSubmitStep1.click();
        webElementsVendorContract.correspondentAccountStep1.setValue("SDFGHJNB");
        webElementsVendorContract.step1CorrespondentAccountHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.nameBankStep1.click();
        webElementsVendorContract.correspondentAccountStep1.shouldBe(empty);
        webElementsVendorContract.correspondentAccountStep1.setValue("SDFGHJNB456789%;");
        webElementsVendorContract.step1CorrespondentAccountHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.nameBankStep1.click();
        webElementsVendorContract.correspondentAccountStep1.shouldBe(empty);
        webElementsVendorContract.correspondentAccountStep1.setValue("8-+");
        webElementsVendorContract.step1CorrespondentAccountHelp.shouldNot(exist);
        webElementsVendorContract.nameBankStep1.click();
        webElementsVendorContract.correspondentAccountStep1.shouldHave(attribute("value", "8"));
        webElementsVendorContract.correspondentAccountStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.step1CorrespondentAccountHelp.should(exist);
        webElementsVendorContract.correspondentAccountStep1.setValue("87654347");
        webElementsVendorContract.step1CorrespondentAccountHelp.shouldNot(exist);
        webElementsVendorContract.correspondentAccountStep1.shouldHave(attribute("value", "87654347"));

    }
    @Test
    @Tag("TMOT-357")
    @DisplayName("Проверка заполнения поля Расчётный счёт")
    void CheckingInputCurrentAccountStep1() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.buttonSubmitStep1.click();
        webElementsVendorContract.currentAccountStep1.setValue("ABCDEFG");
        webElementsVendorContract.step1CurrentAccountHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.nameBankStep1.click();
        webElementsVendorContract.currentAccountStep1.shouldBe(empty);
        webElementsVendorContract.currentAccountStep1.setValue("ABC4567890EFG-+?");
        webElementsVendorContract.step1CurrentAccountHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.nameBankStep1.click();
        webElementsVendorContract.currentAccountStep1.shouldBe(empty);
        webElementsVendorContract.currentAccountStep1.setValue("2@)-");
        webElementsVendorContract.step1CurrentAccountHelp.shouldNot(exist);
        webElementsVendorContract.nameBankStep1.click();
        webElementsVendorContract.currentAccountStep1.shouldHave(attribute("value", "2"));
        webElementsVendorContract.currentAccountStep1.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.step1CurrentAccountHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.currentAccountStep1.setValue("345678909876");
        webElementsVendorContract.step1CurrentAccountHelp.shouldNot(exist);
    }
    @Test
    @Tag("TMOT-358")
    @DisplayName("Сабмит Шага 1 без заполнения, заполнение")
    void FillingStep1AfterSubmit() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.buttonSubmitStep1.click();
        webElementsVendorContract.managementSelectStep1.click();
        webElementsVendorContract.managementListStep1.pressEnter();
        webElementsVendorContract.step1ManagementHelp.shouldNot(exist);
        webElementsVendorContract.ogrnStep1.setValue("9876543");
        webElementsVendorContract.step1OGRNHelp.shouldNot(exist);
        webElementsVendorContract.fioSignatoryStep1.setValue("Петрова Петра Петровича");
        webElementsVendorContract.step1FIOSignatoryHelp.shouldNot(exist);
        webElementsVendorContract.positionSignatoryStep1.setValue("Руководителя территориального отделения");
        webElementsVendorContract.step1PositionSignatoryHelp.shouldNot(exist);
        webElementsVendorContract.fioPropsStep1.setValue("Петров П.П.");
        webElementsVendorContract.step1FIOPropsHelp.shouldNot(exist);
        webElementsVendorContract.positionPropsStep1.setValue("Руководитель территориального отделения");
        webElementsVendorContract.step1PositionPropsHelp.shouldNot(exist);
        webElementsVendorContract.emailStep1.setValue("test@test.ru");
        webElementsVendorContract.step1EmailHelp.shouldNot(exist);
        webElementsVendorContract.juroAddressStep1.setValue("Ленинградская область, г. Всеволожск, ул. Ленинградская, дом 5, строение FGHF, офис 34567890");
        webElementsVendorContract.step1JuroAddressHelp.shouldNot(exist);
        webElementsVendorContract.factoAddressStep1.setValue("г. Санкт-Петербург, пр. Александровской фермы, дом 56, корпус АБВ, офис 678, кабинет 876");
        webElementsVendorContract.step1FactoAddressHelp.shouldNot(exist);
        webElementsVendorContract.rightToSignSelectStep1.click();
        webElementsVendorContract.rightToSignListStep1.pressEnter();
        webElementsVendorContract.step1RightToSignHelp.shouldNot(exist);
        webElementsVendorContract.bikStep1.setValue("345678999999");
        webElementsVendorContract.step1BIKHelp.shouldNot(exist);
        webElementsVendorContract.nameBankStep1.setValue("Северо-Западный ПАО Сбербанк России 123456");
        webElementsVendorContract.step1NameBankHelp.shouldNot(exist);
        webElementsVendorContract.correspondentAccountStep1.setValue("87654347");
        webElementsVendorContract.step1CorrespondentAccountHelp.shouldNot(exist);
        webElementsVendorContract.currentAccountStep1.setValue("345678909876");
        webElementsVendorContract.step1CurrentAccountHelp.shouldNot(exist);
    }
    @Test
    @Tag("TMOT-338")
    @DisplayName("Заполнение Шага 1, Возврат на Шаг 0")
    void FillingStep1ReturnToStep0() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.managementSelectStep1.click();
        webElementsVendorContract.managementListStep1.pressEnter();
        webElementsVendorContract.ogrnStep1.setValue("9876543");
        webElementsVendorContract.fioSignatoryStep1.setValue("Петрова Петра Петровича");
        webElementsVendorContract.positionSignatoryStep1.setValue("Руководителя территориального отделения");
        webElementsVendorContract.fioPropsStep1.setValue("Петров П.П.");
        webElementsVendorContract.positionPropsStep1.setValue("Руководитель территориального отделения");
        webElementsVendorContract.emailStep1.setValue("test@test.ru");
        webElementsVendorContract.juroAddressStep1.setValue("Ленинградская область, г. Всеволожск, ул. Ленинградская, дом 5, строение FGHF, офис 34567890");
        webElementsVendorContract.factoAddressStep1.setValue("г. Санкт-Петербург, пр. Александровской фермы, дом 56, корпус АБВ, офис 678, кабинет 876");
        webElementsVendorContract.rightToSignSelectStep1.click();
        webElementsVendorContract.rightToSignListStep1.pressEnter();
        webElementsVendorContract.bikStep1.setValue("345678999999");
        webElementsVendorContract.nameBankStep1.setValue("Северо-Западный ПАО Сбербанк России 123456");
        webElementsVendorContract.correspondentAccountStep1.setValue("87654347");
        webElementsVendorContract.currentAccountStep1.setValue("345678909876");
        webElementsVendorContract.buttonBackStep1.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.managementSelectStep1.shouldHave(text("ИП на упрощённой системе налогообложения (УСН))"));
        webElementsVendorContract.ogrnStep1.shouldHave(attribute("value", "9876543"));
        webElementsVendorContract.fioSignatoryStep1.shouldHave(attribute("value", "Петрова Петра Петровича"));
        webElementsVendorContract.positionSignatoryStep1.shouldHave(attribute("value", "Руководителя территориального отделения"));
        webElementsVendorContract.fioPropsStep1.shouldHave(attribute("value", "Петров П.П."));
        webElementsVendorContract.positionPropsStep1.shouldHave(attribute("value", "Руководитель территориального отделения"));
        webElementsVendorContract.emailStep1.shouldHave(attribute("value", "test@test.ru"));
        webElementsVendorContract.juroAddressStep1.shouldHave(text("Ленинградская область, г. Всеволожск, ул. Ленинградская, дом 5, строение FGHF, офис 34567890"));
        webElementsVendorContract.factoAddressStep1.shouldHave(text("г. Санкт-Петербург, пр. Александровской фермы, дом 56, корпус АБВ, офис 678, кабинет 876"));
        webElementsVendorContract.rightToSignSelectStep1.shouldHave(text("Устава"));
        webElementsVendorContract.bikStep1.shouldHave(attribute("value", "345678999999"));
        webElementsVendorContract.nameBankStep1.shouldHave(attribute("value", "Северо-Западный ПАО Сбербанк России 123456"));
        webElementsVendorContract.correspondentAccountStep1.shouldHave(attribute("value", "87654347"));
        webElementsVendorContract.currentAccountStep1.shouldHave(attribute("value", "345678909876"));
    }
    @Test
    @Tag("TMOT-359")
    @DisplayName("Сабмит заполненного Шага 1, возврат на него")
    void SubmitStep1ReturnBack() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.managementSelectStep1.click();
        webElementsVendorContract.managementListStep1.pressEnter();
        webElementsVendorContract.ogrnStep1.setValue("9876543");
        webElementsVendorContract.fioSignatoryStep1.setValue("Петрова Петра Петровича");
        webElementsVendorContract.positionSignatoryStep1.setValue("Руководителя территориального отделения");
        webElementsVendorContract.fioPropsStep1.setValue("Петров П.П.");
        webElementsVendorContract.positionPropsStep1.setValue("Руководитель территориального отделения");
        webElementsVendorContract.emailStep1.setValue("test@test.ru");
        webElementsVendorContract.juroAddressStep1.setValue("Ленинградская область, г. Всеволожск, ул. Ленинградская, дом 5, строение FGHF, офис 34567890");
        webElementsVendorContract.factoAddressStep1.setValue("г. Санкт-Петербург, пр. Александровской фермы, дом 56, корпус АБВ, офис 678, кабинет 876");
        webElementsVendorContract.rightToSignSelectStep1.click();
        webElementsVendorContract.rightToSignListStep1.pressEnter();
        webElementsVendorContract.bikStep1.setValue("345678999999");
        webElementsVendorContract.nameBankStep1.setValue("Северо-Западный ПАО Сбербанк России 123456");
        webElementsVendorContract.correspondentAccountStep1.setValue("87654347");
        webElementsVendorContract.currentAccountStep1.setValue("345678909876");
        webElementsVendorContract.buttonSubmitStep1.click();
        webElementsVendorContract.buttonBackStep2.click();
        webElementsVendorContract.managementSelectStep1.shouldHave(text("ИП на упрощённой системе налогообложения (УСН))"));
        webElementsVendorContract.ogrnStep1.shouldHave(attribute("value", "9876543"));
        webElementsVendorContract.fioSignatoryStep1.shouldHave(attribute("value", "Петрова Петра Петровича"));
        webElementsVendorContract.positionSignatoryStep1.shouldHave(attribute("value", "Руководителя территориального отделения"));
        webElementsVendorContract.fioPropsStep1.shouldHave(attribute("value", "Петров П.П."));
        webElementsVendorContract.positionPropsStep1.shouldHave(attribute("value", "Руководитель территориального отделения"));
        webElementsVendorContract.emailStep1.shouldHave(attribute("value", "test@test.ru"));
        webElementsVendorContract.juroAddressStep1.shouldHave(text("Ленинградская область, г. Всеволожск, ул. Ленинградская, дом 5, строение FGHF, офис 34567890"));
        webElementsVendorContract.factoAddressStep1.shouldHave(text("г. Санкт-Петербург, пр. Александровской фермы, дом 56, корпус АБВ, офис 678, кабинет 876"));
        webElementsVendorContract.rightToSignSelectStep1.shouldHave(text("Устава"));
        webElementsVendorContract.bikStep1.shouldHave(attribute("value", "345678999999"));
        webElementsVendorContract.nameBankStep1.shouldHave(attribute("value", "Северо-Западный ПАО Сбербанк России 123456"));
        webElementsVendorContract.correspondentAccountStep1.shouldHave(attribute("value", "87654347"));
        webElementsVendorContract.currentAccountStep1.shouldHave(attribute("value", "345678909876"));
    }

    @Test
    @Tag("TMOT-360")
    @DisplayName("Заполнение Шага 1, переход в Анкету и назад")
    void FillingStep1TransitionToVendorForm() {
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.managementSelectStep1.click();
        webElementsVendorContract.managementListStep1.pressEnter();
        webElementsVendorContract.ogrnStep1.setValue("9876543");
        webElementsVendorContract.fioSignatoryStep1.setValue("Петрова Петра Петровича");
        webElementsVendorContract.positionSignatoryStep1.setValue("Руководителя территориального отделения");
        webElementsVendorContract.fioPropsStep1.setValue("Петров П.П.");
        webElementsVendorContract.positionPropsStep1.setValue("Руководитель территориального отделения");
        webElementsVendorContract.emailStep1.setValue("test@test.ru");
        webElementsVendorContract.juroAddressStep1.setValue("Ленинградская область, г. Всеволожск, ул. Ленинградская, дом 5, строение FGHF, офис 34567890");
        webElementsVendorContract.factoAddressStep1.setValue("г. Санкт-Петербург, пр. Александровской фермы, дом 56, корпус АБВ, офис 678, кабинет 876");
        webElementsVendorContract.rightToSignSelectStep1.click();
        webElementsVendorContract.rightToSignListStep1.pressEnter();
        webElementsVendorContract.bikStep1.setValue("345678999999");
        webElementsVendorContract.nameBankStep1.setValue("Северо-Западный ПАО Сбербанк России 123456");
        webElementsVendorContract.correspondentAccountStep1.setValue("87654347");
        webElementsVendorContract.currentAccountStep1.setValue("345678909876");
        webelements.menuVendorForm.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.radiobuttonStep0Help.shouldHave(text("Пожалуйста, заполните обязательное поле"));
    }
}
