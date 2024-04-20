package lib.webElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class webElementsVendorContract {
    //Элементы Шага 0
    public static SelenideElement radiobuttonStep0Help = $("#pathwise_radio_help");
    public static SelenideElement buttonSubmitStep0 = $(By.xpath("//button[contains(.,'Продолжить')]"));
    public static SelenideElement radiobuttonStepONO = $(By.xpath(("//input[@value='Нет']")));
    public static SelenideElement radiobuttonStepOYes = $(By.xpath(("//input[@value='Да']")));
    public static SelenideElement labelRadiobuttonNO = $(By.xpath("//input[@value='Нет']/../../span[2]"));
    public static SelenideElement labelRadiobuttonYes = $(By.xpath("//input[@value='Да']/../../span[2]"));
    public static SelenideElement selectedCheckbox = $(By.xpath("//div[@aria-required='true']"));
    public static SelenideElement subtitleVendorContract = $(By.xpath("//div[@role='alert']/following-sibling::div/span/h2"));
    //Элементы Шага 1
    public static SelenideElement subtitleStep1 = $(By.xpath("//div[@role='alert']/following-sibling::div[4]/following-sibling::form/div"));
    public static SelenideElement buttonBackStep1 = $(By.xpath("//button[contains(.,'Назад')]"));
    public static SelenideElement buttonSubmitStep1 = $(By.xpath("//button[contains(.,'Продолжить')]"));
    public static SelenideElement managementSelectStep1 = $(By.xpath("//input[@id='generateContract_informationEntity_managment']/parent::span/parent::div"));
    public static SelenideElement managementListStep1 = $("#generateContract_informationEntity_managment");
    public static SelenideElement step1ManagementHelp= $("#generateContract_informationEntity_managment_help");
    public static SelenideElement ogrnStep1= $("#generateContract_informationEntity_ogrn");
    public static SelenideElement step1OGRNHelp= $("#generateContract_informationEntity_ogrn_help");
    public static SelenideElement fioSignatoryStep1= $("#generateContract_agreement_fioSignatory");
    public static SelenideElement step1FIOSignatoryHelp= $("#generateContract_agreement_fioSignatory_help");
    public static SelenideElement step1FIOSignatoryExtra= $("#generateContract_agreement_fioSignatory_extra");
    public static SelenideElement positionSignatoryStep1= $("#generateContract_agreement_positionSignatory");
    public static SelenideElement step1PositionSignatoryHelp= $("#generateContract_agreement_positionSignatory_help");
    public static SelenideElement step1PositionSignatoryExtra= $("#generateContract_agreement_positionSignatory_extra");
    public static SelenideElement fioPropsStep1= $("#generateContract_agreement_fioProps");
    public static SelenideElement step1FIOPropsHelp= $("#generateContract_agreement_fioProps_help");
    public static SelenideElement step1FIOPropsExtra= $("#generateContract_agreement_fioProps_extra");
    public static SelenideElement positionPropsStep1= $("#generateContract_agreement_positionProps");
    public static SelenideElement step1PositionPropsHelp= $("#generateContract_agreement_positionProps_help");
    public static SelenideElement step1PositionPropsExtra= $("#generateContract_agreement_positionProps_extra");
    public static SelenideElement emailStep1= $("#generateContract_agreement_emailMerch");
    public static SelenideElement step1EmailHelp= $("#generateContract_agreement_emailMerch_help");
    public static SelenideElement juroAddressStep1= $("#generateContract_agreement_legalAddress");
    public static SelenideElement step1JuroAddressHelp= $("#generateContract_agreement_legalAddress_help");
    public static SelenideElement factoAddressStep1= $("#generateContract_agreement_actualAddress");
    public static SelenideElement step1FactoAddressHelp= $("#generateContract_agreement_actualAddress_help");
    public static SelenideElement checkboxAddressStep1 = $("#generateContract_agreement_checkbox");
    public static SelenideElement checkboxAddressIsCheckedStep1 = $(By.xpath("//input[@id='generateContract_agreement_checkbox']/parent::span[contains(@class,'checked')]"));
    public static SelenideElement checkboxAddressTitleStep1 = $(By.xpath("//input[@id='generateContract_agreement_checkbox']/parent::span/following-sibling::span"));
    public static SelenideElement rightToSignSelectStep1 = $(By.xpath("//input[@id='generateContract_agreement_rightToSign']/parent::span/parent::div"));
    public static SelenideElement rightToSignListStep1 = $("#generateContract_agreement_rightToSign");
    public static SelenideElement step1RightToSignHelp= $("#generateContract_agreement_rightToSign_help");
    public static SelenideElement rightToSignNumberStep1= $("#generateContract_agreement_number");
    public static SelenideElement step1RightToSignNumberHelp= $("#generateContract_agreement_number_help");
    public static SelenideElement rightToSignDateStep1= $("#generateContract_agreement_date");
    static String twoDaysAgo = lib.ui.MainPageObject.getDayTwoDaysAgo();
    public static SelenideElement rightToSignNumberOfDayStep1 = $(By.xpath("//tbody/tr//td[contains(.,"+twoDaysAgo+")]"));
    public static SelenideElement bikStep1= $("#generateContract_bankDetails_bik");
    public static SelenideElement step1BIKHelp= $("#generateContract_bankDetails_bik_help");
    public static SelenideElement nameBankStep1= $("#generateContract_bankDetails_nameBank");
    public static SelenideElement step1NameBankHelp= $("#generateContract_bankDetails_nameBank_help");
    public static SelenideElement correspondentAccountStep1= $("#generateContract_bankDetails_correspondentAccount");
    public static SelenideElement step1CorrespondentAccountHelp= $("#generateContract_bankDetails_correspondentAccount_help");
    public static SelenideElement currentAccountStep1= $("#generateContract_bankDetails_currentAccount");
    public static SelenideElement step1CurrentAccountHelp= $("#generateContract_bankDetails_currentAccount_help");
    //Элементы Шага 2
    public static SelenideElement buttonSubmitStep2 = $(By.xpath("//button[contains(.,'Продолжить')]"));
    public static SelenideElement buttonBackStep2 = $(By.xpath("//button[contains(.,'Назад')]"));
    public static SelenideElement defermentStep2 = $(By.xpath("//input[contains(@id,'deferment')]"));
    public static SelenideElement groupStep2 = $(By.xpath("//input[contains(@id,'group')]"));
    public static SelenideElement nameStep2 = $(By.xpath("//input[contains(@id,'name')]"));
    public static SelenideElement discountStep2 = $(By.xpath("//input[contains(@id,'disk')]"));
    public static SelenideElement questionStep2 = $(By.xpath("//div[@class='ant-input-number-group-addon']"));
    public static SelenideElement tooltipStep2 = $(By.xpath("//div[@class='ant-input-number-group-addon']/div[@class='ant-tooltip-open']"));

    ////div[@class='ant-input-number-group-addon']/div[@class='ant-tooltip-open']  тултип
    public static SelenideElement step2DefermentHelp1= $(By.xpath("//div[contains(@id,'deferment_help')]/div[1]"));
    public static SelenideElement step2DefermentHelp= $(By.xpath("//div[contains(@id,'deferment_help')]"));
    public static SelenideElement step2DefermentHelp2= $(By.xpath("//div[contains(@id,'deferment_help')]/div[2]"));
    public static SelenideElement step2ProductGroupHelp = $(By.xpath("//div[contains(@id,'group_help')]"));
    public static SelenideElement step2NameOfProductHelp = $(By.xpath("//div[contains(@id,'name_help')]"));
    public static SelenideElement step2DiscountHelp = $(By.xpath("//div[contains(@id,'disk_help')]"));
    public static SelenideElement step2DiscountHelp1 = $(By.xpath("//div[contains(@id,'disk_help')]/div[1]"));
    public static SelenideElement step2DiscountHelp2 = $(By.xpath("//div[contains(@id,'disk_help')]/div[2]"));
    //Элементы Шага 3
    public static SelenideElement sibtitleTable1Step3 = $(By.xpath("//div[contains(@class,'VendorContractForm_steps')]/following-sibling::div/div[1]"));
    public static SelenideElement buttonSubmitStep3 = $(By.xpath("//button[contains(.,'Сгенерировать договор')]"));
    public static SelenideElement buttonBackStep3 = $(By.xpath("//button[contains(.,'Назад')]"));
    //Элементы Шага 4
    public static SelenideElement step4subtitle1 = $(By.xpath("//h3[contains(., 'Договор')]"));
    public static SelenideElement step4unit1 = $(By.xpath("//h3[contains(., 'Договор')]/parent::span/parent::div/parent::div"));
    public static SelenideElement uploadContractHelpStep4 = $("#uploadingDocuments_contract_help");
    public static SelenideElement step4subtitle2 = $(By.xpath("//h3[contains(., 'Устав')]"));
    public static SelenideElement step4unit2 = $(By.xpath("//h3[contains(., 'Устав')]/parent::span/parent::div/parent::div"));
    public static SelenideElement uploadRegulationsHelpStep4 = $("#uploadingDocuments_regulations_help");
    public static SelenideElement step4subtitle3 = $(By.xpath("//h3[contains(., 'Протокол/решение о назначении генерального директора')]"));
    public static SelenideElement step4unit3 = $(By.xpath("//h3[contains(., 'Протокол/решение о назначении генерального директора')]/parent::span/parent::div/parent::div"));
    public static SelenideElement uploadProtocolHelpStep4 = $("#uploadingDocuments_protocol_help");
    public static SelenideElement step4subtitle4 = $(By.xpath("//h3[contains(., 'Документы на товарный знак')]"));
    public static SelenideElement step4unit4 = $(By.xpath("//h3[contains(., 'Документы на товарный знак')]/parent::span/parent::div/parent::div"));
    public static SelenideElement uploadTradeMarkHelpStep4 = $("#uploadingDocuments_tradeMark_help");
    public static SelenideElement step4subtitle5 = $(By.xpath("//h3[contains(., 'Копия доверенности')]"));
    public static SelenideElement step4unit5 = $(By.xpath("//h3[contains(., 'Копия доверенности')]/parent::span/parent::div/parent::div"));
    public static SelenideElement step4subtitle6 = $(By.xpath("//h3[contains(., 'Декларация по УСН')]"));
    public static SelenideElement step4unit6 = $(By.xpath("//h3[contains(., 'Декларация по УСН')]/parent::span/parent::div/parent::div"));
    public static SelenideElement step4subtitle7 = $(By.xpath("//h3[contains(., 'Дополнительные документы')]"));
    public static SelenideElement step4unit7 = $(By.xpath("//h3[contains(., 'Дополнительные документы')]/parent::span/parent::div/parent::div"));
    public static SelenideElement buttonBackStep4 = $(By.xpath("//button[contains(.,'Назад')]"));
    public static SelenideElement buttonSubmitStep4 = $(By.xpath("//button[contains(.,'Отправить договор')]"));
    //Степпер
    public static SelenideElement step0IsFinished = $(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'finish' )]"));
    public static SelenideElement step0IsActive = $(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'active' )]"));
    public static SelenideElement step1IsFinished = $(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]"));
    public static SelenideElement step1IsActive = $(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'active' )]"));
    public static SelenideElement step2IsActive =$(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'active' )]"));
    public static SelenideElement step2IsFinished = $(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]"));
    public static SelenideElement step3IsActive =$(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'active' )]"));
    public static SelenideElement step4ActiveFromStep0 = $(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'finish')]/following-sibling::div[1][contains(@class,'wait')]/following-sibling::div[1][contains(@class,'wait')]/following-sibling::div[1][contains(@class,'wait')]/following-sibling::div[1][contains(@class,'active')]"));


}
