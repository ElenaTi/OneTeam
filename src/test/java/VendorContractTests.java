import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import lib.webElements.webElementsVendorContract;
import lib.webElements.webElementsVendorForm;
import lib.webElements.webelements;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class VendorContractTests {
    @BeforeAll
    @DisplayName("Размер экрана 1920х1280, Авторизация")
    static void start() {
        //Configuration.browser = "firefox";
        //Configuration.browser = "edge";
        Configuration.browserSize = "1920x1280";
        lib.ui.LoginPageObject.Login("9215642te", "rikb0444");
    }
    @Test
    @Tag("TMOT-337")
    @DisplayName("Переход с 0 на 4 Шаг, сабмит без заполнения, Возврат на Шаг 0")
    void ReturnToStep0FromStep4() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        webElementsVendorContract.radiobuttonStepOYes.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.step4ActiveFromStep0.should(exist);
        webElementsVendorContract.subtitleVendorContract.shouldHave(text("Ознакомьтесь с шаблоном договора поставщика:"));
        webElementsVendorContract.step4unit1.shouldNotHave(text("Скачать договор для подписания"));
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
        webElementsVendorContract.step4ActiveFromStep0.should(exist);
        webElementsVendorContract.uploadContractHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadProtocolHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadRegulationsHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadTradeMarkHelpStep4.shouldNot(exist);
    }


    @Test
    @Tag("")
    @DisplayName("Сабмит Шага 3 без заполнения")
    void SubmitStep3WithoutFilling() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.FillingStep2();
        lib.ui.VendorContractPageObgect.SubmitStep2();
        webElementsVendorContract.buttonSubmitStep3.click();
        webElementsVendorContract.step3ImageGoodsDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ConfiguratorDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3TechInfoDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3CurrentCertificatesDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ProductDescriptionDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3AdditionalImageGoodDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3VideoMaterialsDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ModelTechInfoDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ConstructorDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ProductAnaloguesDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3SimilarProductsDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3CharacteristicsDatabaseDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingCatalogEmloyeesFIOHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingCatalogEmloyeesPositionHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmailHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ElectronicArrivalTransferHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ElectronicArrivalStartDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ElectronicArrivalLaunchDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ElectronicOrderTransferHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ElectronicOrderStartDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ElectronicOrderLaunchDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ConfirmOrderTransferHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ConfirmOrderStartDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ConfirmOrderLaunchDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3NomenclatureFileRemainsTransferHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3NomenclatureFileRemainsStartDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3NomenclatureFileRemainsLaunchDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3NomenclatureFilePriceTransferHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3NomenclatureFilePriceStartDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3NomenclatureFilePriceLaunchDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3EstimatedDeliveryTransferHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3EstimatedDeliveryStartDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3EstimatedDeliveryLaunchDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3SpecialConditionsTransferHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3SpecialConditionsStartDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3SpecialConditionsLaunchDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3NomenclatureFileCharacteristicsTransferHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3NomenclatureFileCharacteristicsStartDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3NomenclatureFileCharacteristicsLaunchDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIOHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPositionHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmailHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));

        webElementsVendorContract.step3UPDStartDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3UPDLaunchDateDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ActServicesStartDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ActServicesLaunchDateDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3UKDStartDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3UKDLaunchDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3AdditionalAgreementsStartDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3AdditionalAgreementsLaunchDateDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3SpecificationStartDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3SpecificationLaunchDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3PowersAttorneyStartDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3PowersAttorneyLaunchDateDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ActReconciliationStartDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ActReconciliationLaunchDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ActReportStartDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ActReportLaunchDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ActDiscrepancyStartDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3ActDiscrepancyLaunchDateHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingUZEDOEmloyeesFIOHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingUZEDOEmloyeesPositionHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmailHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));

        webElementsVendorContract.step3startEndDatePublicationMaterialsHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesFIOHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesPositionHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesPhoneOrEmailHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.buttonBackStep3.click();
        webElementsVendorContract.buttonSubmitStep2.click();
        webElementsVendorContract.step3ImageGoodsDateHelp.shouldNot(exist);
        webElementsVendorContract.step3ConfiguratorDateHelp.shouldNot(exist);
        webElementsVendorContract.step3TechInfoDateHelp.shouldNot(exist);
        webElementsVendorContract.step3CurrentCertificatesDateHelp.shouldNot(exist);
        webElementsVendorContract.step3ProductDescriptionDateHelp.shouldNot(exist);
        webElementsVendorContract.step3AdditionalImageGoodDateHelp.shouldNot(exist);
        webElementsVendorContract.step3VideoMaterialsDateHelp.shouldNot(exist);
        webElementsVendorContract.step3ModelTechInfoDateHelp.shouldNot(exist);
        webElementsVendorContract.step3ConstructorDateHelp.shouldNot(exist);
        webElementsVendorContract.step3ProductAnaloguesDateHelp.shouldNot(exist);
        webElementsVendorContract.step3SimilarProductsDateHelp.shouldNot(exist);
        webElementsVendorContract.step3CharacteristicsDatabaseDateHelp.shouldNot(exist);
        webElementsVendorContract.step3FillingCatalogEmloyeesFIOHelp.shouldNot(exist);
        webElementsVendorContract.step3FillingCatalogEmloyeesPositionHelp.shouldNot(exist);
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmailHelp.shouldNot(exist);
        webElementsVendorContract.step3ElectronicArrivalTransferHelp.shouldNot(exist);
        webElementsVendorContract.step3ElectronicArrivalStartDateHelp.shouldNot(exist);
        webElementsVendorContract.step3ElectronicArrivalLaunchDateHelp.shouldNot(exist);
        webElementsVendorContract.step3ElectronicOrderTransferHelp.shouldNot(exist);
        webElementsVendorContract.step3ElectronicOrderStartDateHelp.shouldNot(exist);
        webElementsVendorContract.step3ElectronicOrderLaunchDateHelp.shouldNot(exist);
        webElementsVendorContract.step3ConfirmOrderTransferHelp.shouldNot(exist);
        webElementsVendorContract.step3ConfirmOrderStartDateHelp.shouldNot(exist);
        webElementsVendorContract.step3ConfirmOrderLaunchDateHelp.shouldNot(exist);
        webElementsVendorContract.step3NomenclatureFileRemainsTransferHelp.shouldNot(exist);
        webElementsVendorContract.step3NomenclatureFileRemainsStartDateHelp.shouldNot(exist);
        webElementsVendorContract.step3NomenclatureFileRemainsLaunchDateHelp.shouldNot(exist);
        webElementsVendorContract.step3NomenclatureFilePriceTransferHelp.shouldNot(exist);
        webElementsVendorContract.step3NomenclatureFilePriceStartDateHelp.shouldNot(exist);
        webElementsVendorContract.step3NomenclatureFilePriceLaunchDateHelp.shouldNot(exist);
        webElementsVendorContract.step3EstimatedDeliveryTransferHelp.shouldNot(exist);
        webElementsVendorContract.step3EstimatedDeliveryStartDateHelp.shouldNot(exist);
        webElementsVendorContract.step3EstimatedDeliveryLaunchDateHelp.shouldNot(exist);
        webElementsVendorContract.step3SpecialConditionsTransferHelp.shouldNot(exist);
        webElementsVendorContract.step3SpecialConditionsStartDateHelp.shouldNot(exist);
        webElementsVendorContract.step3SpecialConditionsLaunchDateHelp.shouldNot(exist);
        webElementsVendorContract.step3NomenclatureFileCharacteristicsTransferHelp.shouldNot(exist);
        webElementsVendorContract.step3NomenclatureFileCharacteristicsStartDateHelp.shouldNot(exist);
        webElementsVendorContract.step3NomenclatureFileCharacteristicsLaunchDateHelp.shouldNot(exist);
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIOHelp.shouldNot(exist);
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPositionHelp.shouldNot(exist);
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmailHelp.shouldNot(exist);

        webElementsVendorContract.step3UPDStartDateHelp.shouldNot(exist);
        webElementsVendorContract.step3UPDLaunchDateDateHelp.shouldNot(exist);
        webElementsVendorContract.step3ActServicesStartDateHelp.shouldNot(exist);
        webElementsVendorContract.step3ActServicesLaunchDateDateHelp.shouldNot(exist);
        webElementsVendorContract.step3UKDStartDateHelp.shouldNot(exist);
        webElementsVendorContract.step3UKDLaunchDateHelp.shouldNot(exist);
        webElementsVendorContract.step3AdditionalAgreementsStartDateHelp.shouldNot(exist);
        webElementsVendorContract.step3AdditionalAgreementsLaunchDateDateHelp.shouldNot(exist);
        webElementsVendorContract.step3SpecificationStartDateHelp.shouldNot(exist);
        webElementsVendorContract.step3SpecificationLaunchDateHelp.shouldNot(exist);
        webElementsVendorContract.step3PowersAttorneyStartDateHelp.shouldNot(exist);
        webElementsVendorContract.step3PowersAttorneyLaunchDateDateHelp.shouldNot(exist);
        webElementsVendorContract.step3ActReconciliationStartDateHelp.shouldNot(exist);
        webElementsVendorContract.step3ActReconciliationLaunchDateHelp.shouldNot(exist);
        webElementsVendorContract.step3ActReportStartDateHelp.shouldNot(exist);
        webElementsVendorContract.step3ActReportLaunchDateHelp.shouldNot(exist);
        webElementsVendorContract.step3ActDiscrepancyStartDateHelp.shouldNot(exist);
        webElementsVendorContract.step3ActDiscrepancyLaunchDateHelp.shouldNot(exist);
        webElementsVendorContract.step3FillingUZEDOEmloyeesFIOHelp.shouldNot(exist);
        webElementsVendorContract.step3FillingUZEDOEmloyeesPositionHelp.shouldNot(exist);
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmailHelp.shouldNot(exist);

        webElementsVendorContract.step3startEndDatePublicationMaterialsHelp.shouldNot(exist);
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesFIOHelp.shouldNot(exist);
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesPositionHelp.shouldNot(exist);
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesPhoneOrEmailHelp.shouldNot(exist);
    }


    @Test
    @Tag("")
    @DisplayName("Заполнение Шага 3 без выбора способа передачи информации о товарах")
    void FillingAndSubmitWithoutMethodOfTransmitionProductInfoStep3() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.FillingStep2();
        lib.ui.VendorContractPageObgect.SubmitStep2();

        String weekAfterToday = lib.ui.MainPageObject.GetFullDateWeekAfterToday();
        String monthAfterToday = lib.ui.MainPageObject.GetFullDateMonthAfterToday();

        selectEnabledDayInCalendar(webElementsVendorContract.imageGoodsDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.imageGoodsDatePickerStep3);
        webElementsVendorContract.imageGoodsDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.configuratorDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.configuratorDatePickerStep3);
        webElementsVendorContract.configuratorDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.techInfoDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.techInfoDatePickerStep3);
        webElementsVendorContract.techInfoDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.currentCertificatesPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.currentCertificatesPickerStep3);
        webElementsVendorContract.currentCertificatesDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.productDescriptionPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.productDescriptionPickerStep3);
        webElementsVendorContract.productDescriptionDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.additionalImageGoodPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalImageGoodPickerStep3);
        webElementsVendorContract.additionalImageGoodDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.videoMaterialsPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.videoMaterialsPickerStep3);
        webElementsVendorContract.videoMaterialsDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.modelTechInfoPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.modelTechInfoPickerStep3);
        webElementsVendorContract.modelTechInfoDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.constructorPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.constructorPickerStep3);
        webElementsVendorContract.constructorDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.productAnaloguesPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.productAnaloguesPickerStep3);
        webElementsVendorContract.productAnaloguesDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.similarProductsPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.similarProductsPickerStep3);
        webElementsVendorContract.similarProductsDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.characteristicsDatabasePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.characteristicsDatabasePickerStep3);
        webElementsVendorContract.characteristicsDatabaseDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        webElementsVendorContract.step3FillingCatalogEmloyeesFIO.setValue("Кукушкина Мария Ивановна");
        webElementsVendorContract.step3FillingCatalogEmloyeesPosition.setValue("сотрудник");
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmail.setValue("89246875445, test@mail.ru");

        webElementsVendorContract.electronicArrivalTransferSelectStep3.click();
        webElementsVendorContract.electronicArrivalTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicArrivalTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        webElementsVendorContract.electronicArrivalStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);
        webElementsVendorContract.electronicArrivalLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.electronicOrderTransferSelectStep3.click();
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.electronicOrderStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicOrderStartDatePickerStep3);
        webElementsVendorContract.electronicOrderStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.electronicOrderLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicOrderLaunchDatePickerStep3);
        webElementsVendorContract.electronicOrderLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.confirmOrderTransferSelectStep3.click();
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.confirmOrderStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.confirmOrderStartDatePickerStep3);
        webElementsVendorContract.confirmOrderStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.confirmOrderLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.confirmOrderLaunchDatePickerStep3);
        webElementsVendorContract.confirmOrderLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.nomenclatureFileRemainsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileRemainsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsStartDatePickerStep3);
        webElementsVendorContract.nomenclatureFileRemainsStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileRemainsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsLaunchDatePickerStep3);
        webElementsVendorContract.nomenclatureFileRemainsLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.nomenclatureFilePriceTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFilePriceStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceStartDatePickerStep3);
        webElementsVendorContract.nomenclatureFilePriceStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFilePriceLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceLaunchDatePickerStep3);
        webElementsVendorContract.nomenclatureFilePriceLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.estimatedDeliveryTransferSelectStep3.click();
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.estimatedDeliveryStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryStartDatePickerStep3);
        webElementsVendorContract.estimatedDeliveryStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.estimatedDeliveryLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryLaunchDatePickerStep3);
        webElementsVendorContract.estimatedDeliveryLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.specialConditionsTransferSelectStep3.click();
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.specialConditionsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.specialConditionsStartDatePickerStep3);
        webElementsVendorContract.specialConditionsStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.specialConditionsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specialConditionsLaunchDatePickerStep3);
        webElementsVendorContract.specialConditionsLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.nomenclatureFileCharacteristicsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsStartDatePickerStep3);
        webElementsVendorContract.nomenclatureFileCharacteristicsStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDatePickerStep3);
        webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIO.setValue("Сусликова Ольга Петровна");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPosition.setValue("бухгалтер");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmail.setValue("987654345678, test@mail.ru");

        selectEnabledDayInCalendar(webElementsVendorContract.updStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.updStartDateUZEDOPickerStep3);
        webElementsVendorContract.updStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.updLaunchDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.updLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.updLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.actServicesStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actServicesStartDateUZEDOPickerStep3);
        webElementsVendorContract.actServicesStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.actServicesLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actServicesLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actServicesLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.ukdStartDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdStartDateUZEDOPickerStep3);
        webElementsVendorContract.ukdStartDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.ukdLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.ukdLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.additionalAgreementsStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsStartDateUZEDOPickerStep3);
        webElementsVendorContract.additionalAgreementsStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.additionalAgreementsLaunchDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.additionalAgreementsLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.specificationStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.specificationStartDateUZEDOPickerStep3);
        webElementsVendorContract.specificationStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.specificationLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specificationLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.specificationLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.powersAttorneyStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.powersAttorneyStartDateUZEDOPickerStep3);
        webElementsVendorContract.powersAttorneyStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.powersAttorneyLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.powersAttorneyLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.powersAttorneyLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.actReconciliationStartDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationStartDateUZEDOPickerStep3);
        webElementsVendorContract.actReconciliationStartDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.actReconciliationLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actReconciliationLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.actReportStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actReportStartDateUZEDOPickerStep3);
        webElementsVendorContract.actReportStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.actReportLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReportLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actReportLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.actDiscrepancyStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyStartDateUZEDOPickerStep3);
        webElementsVendorContract.actDiscrepancyStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.actDiscrepancyLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actDiscrepancyLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.step3FillingUZEDOEmloyeesFIO.setValue("Боброва Анна Викторовна");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPosition.setValue("Специалист всех специалистов");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        selectEnabledDayInCalendar(webElementsVendorContract.startEndDatePublicationMaterialsPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.startEndDatePublicationMaterialsPickerStep3);
        webElementsVendorContract.startEndDatePublicationMaterialsInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.step3PublicationMaterialsEmloyeesFIO.setValue("Колобков Иван Иванович");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPosition.setValue("Специалист всех специалистов");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        webElementsVendorContract.buttonSubmitStep3.click();
        webElementsVendorContract.step4IsActiveAfterStep3.should(exist);
        webElementsVendorContract.step4unit1.shouldHave(text("Скачать договор для подписания"));
    }

    @Test
    @Tag("")
    @DisplayName("Заполнение Шага 3 с выбором способа передачи информации о товарах")
    void FillingAndSubmitWithMethodOfTransmitionProductInfoStep3() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.FillingStep2();
        lib.ui.VendorContractPageObgect.SubmitStep2();

        String weekAfterToday = lib.ui.MainPageObject.GetFullDateWeekAfterToday();
        String monthAfterToday = lib.ui.MainPageObject.GetFullDateMonthAfterToday();

        selectWeekAfterTodayInCalendar(webElementsVendorContract.imageGoodsDatePickerStep3);
        webElementsVendorContract.imageGoodsDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectMonthAfterTodayInCalendar(webElementsVendorContract.configuratorDatePickerStep3);
        webElementsVendorContract.configuratorDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.techInfoDatePickerStep3);
        webElementsVendorContract.techInfoDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectMonthAfterTodayInCalendar(webElementsVendorContract.currentCertificatesPickerStep3);
        webElementsVendorContract.currentCertificatesDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.productDescriptionPickerStep3);
        webElementsVendorContract.productDescriptionDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalImageGoodPickerStep3);
        webElementsVendorContract.additionalImageGoodDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.videoMaterialsPickerStep3);
        webElementsVendorContract.videoMaterialsDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.modelTechInfoPickerStep3);
        webElementsVendorContract.modelTechInfoDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectMonthAfterTodayInCalendar(webElementsVendorContract.constructorPickerStep3);
        webElementsVendorContract.constructorDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.productAnaloguesPickerStep3);
        webElementsVendorContract.productAnaloguesDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.similarProductsPickerStep3);
        webElementsVendorContract.similarProductsDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.characteristicsDatabasePickerStep3);
        webElementsVendorContract.characteristicsDatabaseDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        webElementsVendorContract.imageGoodTransferSelectStep3.click();
        webElementsVendorContract.imageGoodTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.imageGoodTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.imageGoodTransferVariantStep3.click();
        webElementsVendorContract.imageGoodTransferInputStep3.shouldHave(text("Модуль 1С"));

        webElementsVendorContract.configuratorTransferSelectStep3.click();
        webElementsVendorContract.configuratorTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.configuratorTransferVariantStep3.click();
        webElementsVendorContract.configuratorTransferInputStep3.shouldHave(text("API"));

        webElementsVendorContract.techInfoTransferSelectStep3.click();
        webElementsVendorContract.techInfoTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.techInfoTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.techInfoTransferVariantStep3.click();
        webElementsVendorContract.techInfoTransferInputStep3.shouldHave(text("Модуль 1С"));

        webElementsVendorContract.currentCertificatesTransferSelectStep3.click();
        webElementsVendorContract.currentCertificatesTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.currentCertificatesTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.currentCertificatesTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.currentCertificatesTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.currentCertificatesTransferVariantStep3.click();
        webElementsVendorContract.currentCertificatesTransferInputStep3.shouldHave(text("API"));

        webElementsVendorContract.productDescriptionTransferSelectStep3.click();
        webElementsVendorContract.productDescriptionTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.productDescriptionTransferVariantStep3.click();
        webElementsVendorContract.productDescriptionTransferInputStep3.shouldHave(text("API"));

        webElementsVendorContract.additionalImageGoodTransferSelectStep3.click();
        webElementsVendorContract.additionalImageGoodTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.additionalImageGoodTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.additionalImageGoodTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.additionalImageGoodTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.additionalImageGoodTransferVariantStep3.click();
        webElementsVendorContract.additionalImageGoodTransferInputStep3.shouldHave(text("API"));

        webElementsVendorContract.videoMaterialsTransferSelectStep3.click();
        webElementsVendorContract.videoMaterialsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.videoMaterialsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.videoMaterialsTransferVariantStep3.click();
        webElementsVendorContract.videoMaterialsTransferInputStep3.shouldHave(text("Модуль 1С"));

        webElementsVendorContract.modelTechnicalInfoTransferSelectStep3.click();
        webElementsVendorContract.modelTechnicalInfoTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.modelTechnicalInfoTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.modelTechnicalInfoTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.modelTechnicalInfoTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.modelTechnicalInfoTransferVariantStep3.click();
        webElementsVendorContract.modelTechnicalInfoTransferInputStep3.shouldHave(text("API"));

        webElementsVendorContract.constructorTransferSelectStep3.click();
        webElementsVendorContract.constructorTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.constructorTransferVariantStep3.click();
        webElementsVendorContract.constructorTransferInputStep3.shouldHave(text("API"));

        webElementsVendorContract.productAnaloguesTransferSelectStep3.click();
        webElementsVendorContract.productAnaloguesTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.productAnaloguesTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.productAnaloguesTransferVariantStep3.click();
        webElementsVendorContract.productAnaloguesTransferInputStep3.shouldHave(text("Модуль 1С"));

        webElementsVendorContract.similarProductsTransferSelectStep3.click();
        webElementsVendorContract.similarProductsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.similarProductsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.similarProductsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.similarProductsTransferVariantStep3.click();
        webElementsVendorContract.similarProductsTransferInputStep3.shouldHave(text("iPRO OneTeam"));

        webElementsVendorContract.characteristicsDatabaseTransferSelectStep3.click();
        webElementsVendorContract.characteristicsDatabaseTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.characteristicsDatabaseTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.characteristicsDatabaseTransferVariantStep3.click();
        webElementsVendorContract.characteristicsDatabaseTransferInputStep3.shouldHave(text("Модуль 1С"));


        webElementsVendorContract.step3FillingCatalogEmloyeesFIO.setValue("Кукушкина Мария Ивановна");
        webElementsVendorContract.step3FillingCatalogEmloyeesPosition.setValue("сотрудник");
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmail.setValue("89246875445, test@mail.ru");

        webElementsVendorContract.electronicArrivalTransferSelectStep3.click();
        webElementsVendorContract.electronicArrivalTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicArrivalTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicArrivalTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        webElementsVendorContract.electronicArrivalStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);
        webElementsVendorContract.electronicArrivalLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.electronicOrderTransferSelectStep3.click();
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicOrderStartDatePickerStep3);
        webElementsVendorContract.electronicOrderStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicOrderLaunchDatePickerStep3);
        webElementsVendorContract.electronicOrderLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.confirmOrderTransferSelectStep3.click();
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.confirmOrderStartDatePickerStep3);
        webElementsVendorContract.confirmOrderStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.confirmOrderLaunchDatePickerStep3);
        webElementsVendorContract.confirmOrderLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.nomenclatureFileRemainsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsStartDatePickerStep3);
        webElementsVendorContract.nomenclatureFileRemainsStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsLaunchDatePickerStep3);
        webElementsVendorContract.nomenclatureFileRemainsLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.nomenclatureFilePriceTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceStartDatePickerStep3);
        webElementsVendorContract.nomenclatureFilePriceStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceLaunchDatePickerStep3);
        webElementsVendorContract.nomenclatureFilePriceLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.estimatedDeliveryTransferSelectStep3.click();
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryStartDatePickerStep3);
        webElementsVendorContract.estimatedDeliveryStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryLaunchDatePickerStep3);
        webElementsVendorContract.estimatedDeliveryLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.specialConditionsTransferSelectStep3.click();
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.specialConditionsStartDatePickerStep3);
        webElementsVendorContract.specialConditionsStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specialConditionsLaunchDatePickerStep3);
        webElementsVendorContract.specialConditionsLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.nomenclatureFileCharacteristicsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsStartDatePickerStep3);
        webElementsVendorContract.nomenclatureFileCharacteristicsStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDatePickerStep3);
        webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIO.setValue("Хохлова Ольга Петровна");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPosition.setValue("Главный бухгалтер");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmail.setValue("987654345678, test@mail.ru");

        selectWeekAfterTodayInCalendar(webElementsVendorContract.updStartDateUZEDOPickerStep3);
        webElementsVendorContract.updStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectWeekAfterTodayInCalendar(webElementsVendorContract.updLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.updLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.actServicesStartDateUZEDOPickerStep3);
        webElementsVendorContract.actServicesStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actServicesLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actServicesLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdStartDateUZEDOPickerStep3);
        webElementsVendorContract.ukdStartDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.ukdLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsStartDateUZEDOPickerStep3);
        webElementsVendorContract.additionalAgreementsStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.additionalAgreementsLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.specificationStartDateUZEDOPickerStep3);
        webElementsVendorContract.specificationStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specificationLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.specificationLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.powersAttorneyStartDateUZEDOPickerStep3);
        webElementsVendorContract.powersAttorneyStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.powersAttorneyLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.powersAttorneyLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationStartDateUZEDOPickerStep3);
        webElementsVendorContract.actReconciliationStartDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actReconciliationLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.actReportStartDateUZEDOPickerStep3);
        webElementsVendorContract.actReportStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReportLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actReportLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyStartDateUZEDOPickerStep3);
        webElementsVendorContract.actDiscrepancyStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actDiscrepancyLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.step3FillingUZEDOEmloyeesFIO.setValue("Боброва Анна Викторовна");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPosition.setValue("Специалист всех специалистов");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        selectMonthAfterTodayInCalendar(webElementsVendorContract.startEndDatePublicationMaterialsPickerStep3);
        webElementsVendorContract.startEndDatePublicationMaterialsInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.step3PublicationMaterialsEmloyeesFIO.setValue("Колобков Иван Петрович");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPosition.setValue("Главный специалист");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        webElementsVendorContract.buttonSubmitStep3.click();
        webElementsVendorContract.step4IsActiveAfterStep3.should(exist);
        webElementsVendorContract.step4unit1.shouldHave(text("Скачать договор для подписания"));
    }

    @Test
    @Tag("")
    @DisplayName("Заполнение Шага 3 с добавлением сотрудников, возврат на Шаг 2")
    void FillingAndSubmitWithAddingEmloyeesBackToStep2() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.FillingStep2();
        lib.ui.VendorContractPageObgect.SubmitStep2();

        String weekAfterToday = lib.ui.MainPageObject.GetFullDateWeekAfterToday();
        String monthAfterToday = lib.ui.MainPageObject.GetFullDateMonthAfterToday();

        selectWeekAfterTodayInCalendar(webElementsVendorContract.imageGoodsDatePickerStep3);
        webElementsVendorContract.imageGoodsDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectMonthAfterTodayInCalendar(webElementsVendorContract.configuratorDatePickerStep3);
        webElementsVendorContract.configuratorDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.techInfoDatePickerStep3);
        webElementsVendorContract.techInfoDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectMonthAfterTodayInCalendar(webElementsVendorContract.currentCertificatesPickerStep3);
        webElementsVendorContract.currentCertificatesDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.productDescriptionPickerStep3);
        webElementsVendorContract.productDescriptionDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalImageGoodPickerStep3);
        webElementsVendorContract.additionalImageGoodDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.videoMaterialsPickerStep3);
        webElementsVendorContract.videoMaterialsDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.modelTechInfoPickerStep3);
        webElementsVendorContract.modelTechInfoDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectMonthAfterTodayInCalendar(webElementsVendorContract.constructorPickerStep3);
        webElementsVendorContract.constructorDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.productAnaloguesPickerStep3);
        webElementsVendorContract.productAnaloguesDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.similarProductsPickerStep3);
        webElementsVendorContract.similarProductsDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.characteristicsDatabasePickerStep3);
        webElementsVendorContract.characteristicsDatabaseDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        webElementsVendorContract.step3FillingCatalogEmloyeesFIO.setValue("Кукушкина Мария Ивановна");
        webElementsVendorContract.step3FillingCatalogEmloyeesPosition.setValue("сотрудник");
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmail.setValue("89246875445, test@mail.ru");

        webElementsVendorContract.step3FillingCatalogButtonAddEmployee.click();
        webElementsVendorContract.step3FillingCatalogButtonAddEmployee.click();

        webElementsVendorContract.electronicArrivalTransferSelectStep3.click();
        webElementsVendorContract.electronicArrivalTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicArrivalTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicArrivalTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        webElementsVendorContract.electronicArrivalStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);
        webElementsVendorContract.electronicArrivalLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.electronicOrderTransferSelectStep3.click();
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicOrderStartDatePickerStep3);
        webElementsVendorContract.electronicOrderStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicOrderLaunchDatePickerStep3);
        webElementsVendorContract.electronicOrderLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.confirmOrderTransferSelectStep3.click();
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.confirmOrderStartDatePickerStep3);
        webElementsVendorContract.confirmOrderStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.confirmOrderLaunchDatePickerStep3);
        webElementsVendorContract.confirmOrderLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.nomenclatureFileRemainsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsStartDatePickerStep3);
        webElementsVendorContract.nomenclatureFileRemainsStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsLaunchDatePickerStep3);
        webElementsVendorContract.nomenclatureFileRemainsLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.nomenclatureFilePriceTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceStartDatePickerStep3);
        webElementsVendorContract.nomenclatureFilePriceStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceLaunchDatePickerStep3);
        webElementsVendorContract.nomenclatureFilePriceLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.estimatedDeliveryTransferSelectStep3.click();
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryStartDatePickerStep3);
        webElementsVendorContract.estimatedDeliveryStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryLaunchDatePickerStep3);
        webElementsVendorContract.estimatedDeliveryLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.specialConditionsTransferSelectStep3.click();
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.specialConditionsStartDatePickerStep3);
        webElementsVendorContract.specialConditionsStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specialConditionsLaunchDatePickerStep3);
        webElementsVendorContract.specialConditionsLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.nomenclatureFileCharacteristicsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsStartDatePickerStep3);
        webElementsVendorContract.nomenclatureFileCharacteristicsStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDatePickerStep3);
        webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIO.setValue("Хохлова Ольга Петровна");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPosition.setValue("Главный бухгалтер");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmail.setValue("987654345678, test@mail.ru");

        webElementsVendorContract.step3EDIExchangeButtonAddEmployee.click();
        webElementsVendorContract.step3EDIExchangeButtonAddEmployee.click();

        selectWeekAfterTodayInCalendar(webElementsVendorContract.updStartDateUZEDOPickerStep3);
        webElementsVendorContract.updStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectWeekAfterTodayInCalendar(webElementsVendorContract.updLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.updLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.actServicesStartDateUZEDOPickerStep3);
        webElementsVendorContract.actServicesStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actServicesLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actServicesLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdStartDateUZEDOPickerStep3);
        webElementsVendorContract.ukdStartDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.ukdLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsStartDateUZEDOPickerStep3);
        webElementsVendorContract.additionalAgreementsStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.additionalAgreementsLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.specificationStartDateUZEDOPickerStep3);
        webElementsVendorContract.specificationStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specificationLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.specificationLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.powersAttorneyStartDateUZEDOPickerStep3);
        webElementsVendorContract.powersAttorneyStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.powersAttorneyLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.powersAttorneyLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationStartDateUZEDOPickerStep3);
        webElementsVendorContract.actReconciliationStartDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actReconciliationLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.actReportStartDateUZEDOPickerStep3);
        webElementsVendorContract.actReportStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReportLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actReportLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyStartDateUZEDOPickerStep3);
        webElementsVendorContract.actDiscrepancyStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actDiscrepancyLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.step3FillingUZEDOEmloyeesFIO.setValue("Боброва Анна Викторовна");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPosition.setValue("Специалист всех специалистов");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        webElementsVendorContract.step3FillingUZEDOButtonAddEmployee.click();
        webElementsVendorContract.step3FillingUZEDOButtonAddEmployee.click();

        selectMonthAfterTodayInCalendar(webElementsVendorContract.startEndDatePublicationMaterialsPickerStep3);
        webElementsVendorContract.startEndDatePublicationMaterialsInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.step3PublicationMaterialsEmloyeesFIO.setValue("Колобков Иван Петрович");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPosition.setValue("Главный специалист");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        webElementsVendorContract.step3PublicationOfMaterialsButtonAddEmployee.click();
        webElementsVendorContract.step3PublicationOfMaterialsButtonAddEmployee.click();

        webElementsVendorContract.buttonSubmitStep3.click();
        webElementsVendorContract.step4IsActiveAfterStep3.shouldNot(exist);
        webElementsVendorContract.step3IsActive.should(exist);
        webElementsVendorContract.step3FillingCatalogEmloyeesFIOHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingCatalogEmloyeesFIOHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingCatalogEmloyeesPositionHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingCatalogEmloyeesPositionHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmailHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmailHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));

        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIOHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIOHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPositionHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPositionHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmailHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmailHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));

        webElementsVendorContract.step3FillingUZEDOEmloyeesFIOHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingUZEDOEmloyeesFIOHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingUZEDOEmloyeesPositionHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingUZEDOEmloyeesPositionHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmailHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmailHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));

        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesFIOHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesFIOHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesPositionHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesPositionHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesPhoneOrEmailHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesPhoneOrEmailHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));

        webElementsVendorContract.buttonBackStep3.click();
        webElementsVendorContract.buttonSubmitStep2.click();
        webElementsVendorContract.step3FillingCatalogEmloyeesFIOHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3FillingCatalogEmloyeesFIOHelpLine3.shouldNot(exist);
        webElementsVendorContract.step3FillingCatalogEmloyeesPositionHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3FillingCatalogEmloyeesPositionHelpLine3.shouldNot(exist);
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmailHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmailHelpLine3.shouldNot(exist);

        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIOHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIOHelpLine3.shouldNot(exist);
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPositionHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPositionHelpLine3.shouldNot(exist);
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmailHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmailHelpLine3.shouldNot(exist);

        webElementsVendorContract.step3FillingUZEDOEmloyeesFIOHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3FillingUZEDOEmloyeesFIOHelpLine3.shouldNot(exist);
        webElementsVendorContract.step3FillingUZEDOEmloyeesPositionHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3FillingUZEDOEmloyeesPositionHelpLine3.shouldNot(exist);
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmailHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmailHelpLine3.shouldNot(exist);

        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesFIOHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesFIOHelpLine3.shouldNot(exist);
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesPositionHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesPositionHelpLine3.shouldNot(exist);
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesPhoneOrEmailHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesPhoneOrEmailHelpLine3.shouldNot(exist);

        webElementsVendorContract.step3FillingCatalogEmloyeesButtonDeleteLine2.should(exist);
        webElementsVendorContract.step3FillingCatalogEmloyeesButtonDeleteLine3.should(exist);

        webElementsVendorContract.step3FillingEDIExchangeEmloyeesButtonDeleteLine2.should(exist);
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesButtonDeleteLine3.should(exist);

        webElementsVendorContract.step3FillingUZEDOEmloyeesButtonDeleteLine2.should(exist);
        webElementsVendorContract.step3FillingUZEDOEmloyeesButtonDeleteLine3.should(exist);

        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesButtonDeleteLine2.should(exist);
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesButtonDeleteLine3.should(exist);
    }

    @Test
    @Tag("")
    @DisplayName("Заполнение Шага 3 с добавлением 2 сотрудников, заполнением 2, удалением 1")
    void FillingAndSubmitWithAddingAndFillingEmloyeesStep3() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.FillingStep2();
        lib.ui.VendorContractPageObgect.SubmitStep2();

        String weekAfterToday = lib.ui.MainPageObject.GetFullDateWeekAfterToday();
        String monthAfterToday = lib.ui.MainPageObject.GetFullDateMonthAfterToday();

        selectWeekAfterTodayInCalendar(webElementsVendorContract.imageGoodsDatePickerStep3);
        webElementsVendorContract.imageGoodsDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectMonthAfterTodayInCalendar(webElementsVendorContract.configuratorDatePickerStep3);
        webElementsVendorContract.configuratorDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.techInfoDatePickerStep3);
        webElementsVendorContract.techInfoDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectMonthAfterTodayInCalendar(webElementsVendorContract.currentCertificatesPickerStep3);
        webElementsVendorContract.currentCertificatesDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.productDescriptionPickerStep3);
        webElementsVendorContract.productDescriptionDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalImageGoodPickerStep3);
        webElementsVendorContract.additionalImageGoodDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.videoMaterialsPickerStep3);
        webElementsVendorContract.videoMaterialsDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.modelTechInfoPickerStep3);
        webElementsVendorContract.modelTechInfoDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectMonthAfterTodayInCalendar(webElementsVendorContract.constructorPickerStep3);
        webElementsVendorContract.constructorDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.productAnaloguesPickerStep3);
        webElementsVendorContract.productAnaloguesDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.similarProductsPickerStep3);
        webElementsVendorContract.similarProductsDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.characteristicsDatabasePickerStep3);
        webElementsVendorContract.characteristicsDatabaseDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        webElementsVendorContract.step3FillingCatalogEmloyeesFIO.setValue("Кукушкина Мария Ивановна");
        webElementsVendorContract.step3FillingCatalogEmloyeesPosition.setValue("сотрудник");
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmail.setValue("89246875445, test@mail.ru");

        webElementsVendorContract.step3FillingCatalogButtonAddEmployee.click();
        webElementsVendorContract.step3FillingCatalogButtonAddEmployee.click();

        webElementsVendorContract.electronicArrivalTransferSelectStep3.click();
        webElementsVendorContract.electronicArrivalTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicArrivalTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicArrivalTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        webElementsVendorContract.electronicArrivalStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);
        webElementsVendorContract.electronicArrivalLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.electronicOrderTransferSelectStep3.click();
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicOrderStartDatePickerStep3);
        webElementsVendorContract.electronicOrderStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicOrderLaunchDatePickerStep3);
        webElementsVendorContract.electronicOrderLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.confirmOrderTransferSelectStep3.click();
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.confirmOrderStartDatePickerStep3);
        webElementsVendorContract.confirmOrderStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.confirmOrderLaunchDatePickerStep3);
        webElementsVendorContract.confirmOrderLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.nomenclatureFileRemainsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsStartDatePickerStep3);
        webElementsVendorContract.nomenclatureFileRemainsStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsLaunchDatePickerStep3);
        webElementsVendorContract.nomenclatureFileRemainsLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.nomenclatureFilePriceTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceStartDatePickerStep3);
        webElementsVendorContract.nomenclatureFilePriceStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceLaunchDatePickerStep3);
        webElementsVendorContract.nomenclatureFilePriceLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.estimatedDeliveryTransferSelectStep3.click();
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryStartDatePickerStep3);
        webElementsVendorContract.estimatedDeliveryStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryLaunchDatePickerStep3);
        webElementsVendorContract.estimatedDeliveryLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.specialConditionsTransferSelectStep3.click();
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.specialConditionsStartDatePickerStep3);
        webElementsVendorContract.specialConditionsStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specialConditionsLaunchDatePickerStep3);
        webElementsVendorContract.specialConditionsLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.nomenclatureFileCharacteristicsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferVariantStep3.click();
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsStartDatePickerStep3);
        webElementsVendorContract.nomenclatureFileCharacteristicsStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDatePickerStep3);
        webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIO.setValue("Хохлова Ольга Петровна");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPosition.setValue("Главный бухгалтер");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmail.setValue("987654345678, test@mail.ru");

        webElementsVendorContract.step3EDIExchangeButtonAddEmployee.click();
        webElementsVendorContract.step3EDIExchangeButtonAddEmployee.click();

        selectWeekAfterTodayInCalendar(webElementsVendorContract.updStartDateUZEDOPickerStep3);
        webElementsVendorContract.updStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectWeekAfterTodayInCalendar(webElementsVendorContract.updLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.updLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.actServicesStartDateUZEDOPickerStep3);
        webElementsVendorContract.actServicesStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actServicesLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actServicesLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdStartDateUZEDOPickerStep3);
        webElementsVendorContract.ukdStartDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.ukdLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsStartDateUZEDOPickerStep3);
        webElementsVendorContract.additionalAgreementsStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.additionalAgreementsLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.specificationStartDateUZEDOPickerStep3);
        webElementsVendorContract.specificationStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specificationLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.specificationLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.powersAttorneyStartDateUZEDOPickerStep3);
        webElementsVendorContract.powersAttorneyStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.powersAttorneyLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.powersAttorneyLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationStartDateUZEDOPickerStep3);
        webElementsVendorContract.actReconciliationStartDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actReconciliationLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.actReportStartDateUZEDOPickerStep3);
        webElementsVendorContract.actReportStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReportLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actReportLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectWeekAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyStartDateUZEDOPickerStep3);
        webElementsVendorContract.actDiscrepancyStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actDiscrepancyLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.step3FillingUZEDOEmloyeesFIO.setValue("Боброва Анна Викторовна");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPosition.setValue("Специалист всех специалистов");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        webElementsVendorContract.step3FillingUZEDOButtonAddEmployee.click();
        webElementsVendorContract.step3FillingUZEDOButtonAddEmployee.click();

        selectMonthAfterTodayInCalendar(webElementsVendorContract.startEndDatePublicationMaterialsPickerStep3);
        webElementsVendorContract.startEndDatePublicationMaterialsInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.step3PublicationMaterialsEmloyeesFIO.setValue("Колобков Иван Петрович");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPosition.setValue("Главный специалист");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        webElementsVendorContract.step3PublicationOfMaterialsButtonAddEmployee.click();
        webElementsVendorContract.step3PublicationOfMaterialsButtonAddEmployee.click();

        webElementsVendorContract.buttonSubmitStep3.click();
        webElementsVendorContract.step4IsActiveAfterStep3.shouldNot(exist);
        webElementsVendorContract.step3IsActive.should(exist);
        webElementsVendorContract.step3FillingCatalogEmloyeesFIOHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingCatalogEmloyeesFIOHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingCatalogEmloyeesPositionHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingCatalogEmloyeesPositionHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmailHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmailHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));

        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIOHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIOHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPositionHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPositionHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmailHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmailHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));

        webElementsVendorContract.step3FillingUZEDOEmloyeesFIOHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingUZEDOEmloyeesFIOHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingUZEDOEmloyeesPositionHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingUZEDOEmloyeesPositionHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmailHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmailHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));

        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesFIOHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesFIOHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesPositionHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesPositionHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesPhoneOrEmailHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesPhoneOrEmailHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));

        webElementsVendorContract.step3FillingCatalogEmloyeesButtonDeleteLine2.click();

        webElementsVendorContract.step3FillingEDIExchangeEmloyeesButtonDeleteLine2.click();

        webElementsVendorContract.step3FillingUZEDOEmloyeesButtonDeleteLine2.click();

        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesButtonDeleteLine2.click();

        webElementsVendorContract.step3FillingCatalogEmloyeesLine2FIO.setValue("Павлов Максим Степанович");
        webElementsVendorContract.step3FillingCatalogEmloyeesFIOHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3FillingCatalogEmloyeesLine2Position.setValue("Сотрудник отдела по заполнению каталога");
        webElementsVendorContract.step3FillingCatalogEmloyeesPositionHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3FillingCatalogEmloyeesLine2PhoneOrEmail.setValue("234567890, Test@mail");
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmailHelpLine2.shouldNot(exist);

        webElementsVendorContract.step3FillingEDIExchangeEmloyeesLine2FIO.setValue("Пушилин Степан Викторович");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIOHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesLine2Position.setValue("Финансовый директор");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPositionHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesLine2PhoneOrEmail.setValue("98765434567, Test@iek.comtest");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmailHelpLine2.shouldNot(exist);

        webElementsVendorContract.step3FillingUZEDOEmloyeesLine2FIO.setValue("Колобков Степан Максимович");
        webElementsVendorContract.step3FillingUZEDOEmloyeesFIOHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3FillingUZEDOEmloyeesLine2Position.setValue("Начальник отдела");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPositionHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3FillingUZEDOEmloyeesLine2PhoneOrEmail.setValue("98765434567, Test@iek.comtest");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmailHelpLine2.shouldNot(exist);

        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesLine2FIO.setValue("Храмова Екатерина Максимовна");
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesFIOHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesLine2Position.setValue("Генеральный директор");
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesPositionHelpLine2.shouldNot(exist);
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesLine2PhoneOrEmail.setValue("98765434567, Test@test.ru");
        webElementsVendorContract.step3PublicationOfMaterialsEmloyeesPhoneOrEmailHelpLine2.shouldNot(exist);

        webElementsVendorContract.buttonSubmitStep3.click();
        webElementsVendorContract.step4IsActiveAfterStep3.should(exist);
        webElementsVendorContract.step4unit1.shouldHave(text("Скачать договор для подписания"));
    }

    @Test
    @Tag("")
    @DisplayName("Сабмит Шага 4 без заполнения, возврат Назад на шаг 0")
    void SubmitStep4WithoutFillingGoBackToStep0() throws InterruptedException{
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.FillingStep2();
        lib.ui.VendorContractPageObgect.SubmitStep2();

        String weekAfterToday = lib.ui.MainPageObject.GetFullDateWeekAfterToday();
        String monthAfterToday = lib.ui.MainPageObject.GetFullDateMonthAfterToday();

        selectEnabledDayInCalendar(webElementsVendorContract.imageGoodsDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.imageGoodsDatePickerStep3);
        webElementsVendorContract.imageGoodsDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.configuratorDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.configuratorDatePickerStep3);
        webElementsVendorContract.configuratorDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.techInfoDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.techInfoDatePickerStep3);
        webElementsVendorContract.techInfoDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.currentCertificatesPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.currentCertificatesPickerStep3);
        webElementsVendorContract.currentCertificatesDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.productDescriptionPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.productDescriptionPickerStep3);
        webElementsVendorContract.productDescriptionDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.additionalImageGoodPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalImageGoodPickerStep3);
        webElementsVendorContract.additionalImageGoodDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.videoMaterialsPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.videoMaterialsPickerStep3);
        webElementsVendorContract.videoMaterialsDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.modelTechInfoPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.modelTechInfoPickerStep3);
        webElementsVendorContract.modelTechInfoDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.constructorPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.constructorPickerStep3);
        webElementsVendorContract.constructorDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.productAnaloguesPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.productAnaloguesPickerStep3);
        webElementsVendorContract.productAnaloguesDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.similarProductsPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.similarProductsPickerStep3);
        webElementsVendorContract.similarProductsDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.characteristicsDatabasePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.characteristicsDatabasePickerStep3);
        webElementsVendorContract.characteristicsDatabaseDateInputStep3.shouldHave(attribute("value", weekAfterToday));

        webElementsVendorContract.step3FillingCatalogEmloyeesFIO.setValue("Кукушкина Мария Ивановна");
        webElementsVendorContract.step3FillingCatalogEmloyeesPosition.setValue("сотрудник");
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmail.setValue("89246875445, test@mail.ru");

        webElementsVendorContract.electronicArrivalTransferSelectStep3.click();
        webElementsVendorContract.electronicArrivalTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicArrivalTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        webElementsVendorContract.electronicArrivalStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);
        webElementsVendorContract.electronicArrivalLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.electronicOrderTransferSelectStep3.click();
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.electronicOrderStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicOrderStartDatePickerStep3);
        webElementsVendorContract.electronicOrderStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.electronicOrderLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicOrderLaunchDatePickerStep3);
        webElementsVendorContract.electronicOrderLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.confirmOrderTransferSelectStep3.click();
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.confirmOrderStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.confirmOrderStartDatePickerStep3);
        webElementsVendorContract.confirmOrderStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.confirmOrderLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.confirmOrderLaunchDatePickerStep3);
        webElementsVendorContract.confirmOrderLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.nomenclatureFileRemainsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileRemainsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsStartDatePickerStep3);
        webElementsVendorContract.nomenclatureFileRemainsStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileRemainsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsLaunchDatePickerStep3);
        webElementsVendorContract.nomenclatureFileRemainsLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.nomenclatureFilePriceTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFilePriceStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceStartDatePickerStep3);
        webElementsVendorContract.nomenclatureFilePriceStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFilePriceLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceLaunchDatePickerStep3);
        webElementsVendorContract.nomenclatureFilePriceLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.estimatedDeliveryTransferSelectStep3.click();
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.estimatedDeliveryStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryStartDatePickerStep3);
        webElementsVendorContract.estimatedDeliveryStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.estimatedDeliveryLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryLaunchDatePickerStep3);
        webElementsVendorContract.estimatedDeliveryLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.specialConditionsTransferSelectStep3.click();
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.specialConditionsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.specialConditionsStartDatePickerStep3);
        webElementsVendorContract.specialConditionsStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.specialConditionsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specialConditionsLaunchDatePickerStep3);
        webElementsVendorContract.specialConditionsLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.nomenclatureFileCharacteristicsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsStartDatePickerStep3);
        webElementsVendorContract.nomenclatureFileCharacteristicsStartDateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDatePickerStep3);
        webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIO.setValue("Сусликова Ольга Петровна");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPosition.setValue("бухгалтер");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmail.setValue("987654345678, test@mail.ru");

        selectEnabledDayInCalendar(webElementsVendorContract.updStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.updStartDateUZEDOPickerStep3);
        webElementsVendorContract.updStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.updLaunchDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.updLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.updLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.actServicesStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actServicesStartDateUZEDOPickerStep3);
        webElementsVendorContract.actServicesStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.actServicesLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actServicesLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actServicesLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.ukdStartDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdStartDateUZEDOPickerStep3);
        webElementsVendorContract.ukdStartDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.ukdLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.ukdLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.additionalAgreementsStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsStartDateUZEDOPickerStep3);
        webElementsVendorContract.additionalAgreementsStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.additionalAgreementsLaunchDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.additionalAgreementsLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.specificationStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.specificationStartDateUZEDOPickerStep3);
        webElementsVendorContract.specificationStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.specificationLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specificationLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.specificationLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.powersAttorneyStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.powersAttorneyStartDateUZEDOPickerStep3);
        webElementsVendorContract.powersAttorneyStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.powersAttorneyLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.powersAttorneyLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.powersAttorneyLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.actReconciliationStartDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationStartDateUZEDOPickerStep3);
        webElementsVendorContract.actReconciliationStartDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.actReconciliationLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actReconciliationLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.actReportStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actReportStartDateUZEDOPickerStep3);
        webElementsVendorContract.actReportStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.actReportLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReportLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actReportLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        selectEnabledDayInCalendar(webElementsVendorContract.actDiscrepancyStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyStartDateUZEDOPickerStep3);
        webElementsVendorContract.actDiscrepancyStartDateUZEDODateInputStep3.shouldHave(attribute("value", weekAfterToday));
        selectEnabledDayInCalendar(webElementsVendorContract.actDiscrepancyLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyLaunchDateUZEDOPickerStep3);
        webElementsVendorContract.actDiscrepancyLaunchDateUZEDODateInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.step3FillingUZEDOEmloyeesFIO.setValue("Боброва Анна Викторовна");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPosition.setValue("Специалист всех специалистов");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        selectEnabledDayInCalendar(webElementsVendorContract.startEndDatePublicationMaterialsPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.startEndDatePublicationMaterialsPickerStep3);
        webElementsVendorContract.startEndDatePublicationMaterialsInputStep3.shouldHave(attribute("value", monthAfterToday));

        webElementsVendorContract.step3PublicationMaterialsEmloyeesFIO.setValue("Колобков Иван Иванович");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPosition.setValue("Специалист всех специалистов");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        webElementsVendorContract.buttonSubmitStep3.click();
        Thread.sleep(1000);
        webElementsVendorContract.step4IsActiveAfterStep3.should(exist);


        webElementsVendorContract.buttonSubmitStep4.click();
        Thread.sleep(300);
        webElementsVendorContract.uploadContractHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.uploadProtocolHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.uploadRegulationsHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.uploadTradeMarkHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));

        webElementsVendorContract.buttonBackStep4.click();
        webElementsVendorContract.step3IsActive.should(exist);
        webElementsVendorContract.buttonBackStep3.click();
        Thread.sleep(300);
        webElementsVendorContract.step2IsActive.should(exist);
        webElementsVendorContract.buttonBackStep2.click();
        webElementsVendorContract.step1IsActive.should(exist);
        webElementsVendorContract.buttonBackStep1.click();
        webElementsVendorContract.step0IsActive.should(exist);
        webElementsVendorContract.radiobuttonStepOYes.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.step4ActiveFromStep0.should(exist);

        webElementsVendorContract.uploadContractHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadProtocolHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadRegulationsHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadTradeMarkHelpStep4.shouldNot(exist);

        webElementsVendorContract.buttonBackStep4.click();
        webElementsVendorContract.step0IsActive.should(exist);
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.step1IsActive.should(exist);
        webElementsVendorContract.buttonSubmitStep1.click();
        webElementsVendorContract.step2IsActive.should(exist);
        webElementsVendorContract.buttonSubmitStep2.click();
        webElementsVendorContract.step3IsActive.should(exist);
        webElementsVendorContract.buttonSubmitStep3.click();
        Thread.sleep(500);
        webElementsVendorContract.step4IsActiveAfterStep3.should(exist);
    }

    @Test
    @Tag("")
    @DisplayName("Заполнение и сабмит Шага 4 только с обязательными валидными файлами")
    void SubmitStep4WithRequiredValidFiles() throws InterruptedException {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.FillingStep2();
        lib.ui.VendorContractPageObgect.SubmitStep2();

        selectEnabledDayInCalendar(webElementsVendorContract.imageGoodsDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.imageGoodsDatePickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.configuratorDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.configuratorDatePickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.techInfoDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.techInfoDatePickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.currentCertificatesPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.currentCertificatesPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.productDescriptionPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.productDescriptionPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.additionalImageGoodPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalImageGoodPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.videoMaterialsPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.videoMaterialsPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.modelTechInfoPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.modelTechInfoPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.constructorPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.constructorPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.productAnaloguesPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.productAnaloguesPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.similarProductsPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.similarProductsPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.characteristicsDatabasePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.characteristicsDatabasePickerStep3);

        webElementsVendorContract.step3FillingCatalogEmloyeesFIO.setValue("Кукушкина Мария Ивановна");
        webElementsVendorContract.step3FillingCatalogEmloyeesPosition.setValue("сотрудник");
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmail.setValue("89246875445, test@mail.ru");

        webElementsVendorContract.electronicArrivalTransferSelectStep3.click();
        webElementsVendorContract.electronicArrivalTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicArrivalTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);

        webElementsVendorContract.electronicOrderTransferSelectStep3.click();
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.electronicOrderStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicOrderStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.electronicOrderLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicOrderLaunchDatePickerStep3);

        webElementsVendorContract.confirmOrderTransferSelectStep3.click();
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.confirmOrderStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.confirmOrderStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.confirmOrderLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.confirmOrderLaunchDatePickerStep3);

        webElementsVendorContract.nomenclatureFileRemainsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileRemainsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileRemainsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsLaunchDatePickerStep3);

        webElementsVendorContract.nomenclatureFilePriceTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFilePriceStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFilePriceLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceLaunchDatePickerStep3);

        webElementsVendorContract.estimatedDeliveryTransferSelectStep3.click();
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.estimatedDeliveryStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.estimatedDeliveryLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryLaunchDatePickerStep3);

        webElementsVendorContract.specialConditionsTransferSelectStep3.click();
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.specialConditionsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.specialConditionsStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.specialConditionsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specialConditionsLaunchDatePickerStep3);

        webElementsVendorContract.nomenclatureFileCharacteristicsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDatePickerStep3);

        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIO.setValue("Сусликова Ольга Петровна");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPosition.setValue("бухгалтер");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmail.setValue("987654345678, test@mail.ru");

        selectEnabledDayInCalendar(webElementsVendorContract.updStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.updStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.updLaunchDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.updLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actServicesStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actServicesStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actServicesLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actServicesLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.ukdStartDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.ukdLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.additionalAgreementsStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.additionalAgreementsLaunchDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.specificationStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.specificationStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.specificationLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specificationLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.powersAttorneyStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.powersAttorneyStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.powersAttorneyLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.powersAttorneyLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actReconciliationStartDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actReconciliationLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actReportStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actReportStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actReportLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReportLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actDiscrepancyStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actDiscrepancyLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyLaunchDateUZEDOPickerStep3);

        webElementsVendorContract.step3FillingUZEDOEmloyeesFIO.setValue("Боброва Анна Викторовна");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPosition.setValue("Специалист всех специалистов");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        selectEnabledDayInCalendar(webElementsVendorContract.startEndDatePublicationMaterialsPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.startEndDatePublicationMaterialsPickerStep3);

        webElementsVendorContract.step3PublicationMaterialsEmloyeesFIO.setValue("Колобков Иван Иванович");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPosition.setValue("Специалист всех специалистов");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        webElementsVendorContract.buttonSubmitStep3.click();
        webElementsVendorContract.step4IsActiveAfterStep3.shouldBe(visible, Duration.ofMillis(10000));
        webElementsVendorContract.step4unit1.shouldHave(text("Скачать договор для подписания"));

        webElementsVendorContract.uploadContractStep4.uploadFromClasspath("1.4mb.pdf");
        webElementsVendorContract.uploadRegulationsStep4.uploadFromClasspath(("JPG.jpg"));
        webElementsVendorContract.uploadProtocolStep4.uploadFromClasspath("PNG.png");
        webElementsVendorContract.uploadTradeMarkStep4.uploadFromClasspath("PDF.pdf");
        Thread.sleep(2000);
        webElementsVendorContract.buttonSubmitStep4.click();
        webElementsVendorContract.step5IsActiveAfterFillingStep3.shouldBe(visible, Duration.ofMillis(10000));
        webElementsVendorContract.successSendingContractTitle.shouldHave(text("Договор успешно отправлен на согласование."));
        webElementsVendorContract.successSendingContractSubtitle.shouldHave(text("Мы сообщим вам статус согласования договора после его рассмотрения."));
    }

    @Test
    @Tag("")
    @DisplayName("Заполнение и сабмит Шага 4 с валидными файлами во всех юнитах")
    void SubmitStep4WithAllValidFiles() throws InterruptedException {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.FillingStep2();
        lib.ui.VendorContractPageObgect.SubmitStep2();

        selectEnabledDayInCalendar(webElementsVendorContract.imageGoodsDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.imageGoodsDatePickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.configuratorDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.configuratorDatePickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.techInfoDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.techInfoDatePickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.currentCertificatesPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.currentCertificatesPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.productDescriptionPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.productDescriptionPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.additionalImageGoodPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalImageGoodPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.videoMaterialsPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.videoMaterialsPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.modelTechInfoPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.modelTechInfoPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.constructorPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.constructorPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.productAnaloguesPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.productAnaloguesPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.similarProductsPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.similarProductsPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.characteristicsDatabasePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.characteristicsDatabasePickerStep3);

        webElementsVendorContract.step3FillingCatalogEmloyeesFIO.setValue("Кукушкина Мария Ивановна");
        webElementsVendorContract.step3FillingCatalogEmloyeesPosition.setValue("сотрудник");
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmail.setValue("89246875445, test@mail.ru");

        webElementsVendorContract.electronicArrivalTransferSelectStep3.click();
        webElementsVendorContract.electronicArrivalTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicArrivalTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);

        webElementsVendorContract.electronicOrderTransferSelectStep3.click();
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.electronicOrderStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicOrderStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.electronicOrderLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicOrderLaunchDatePickerStep3);

        webElementsVendorContract.confirmOrderTransferSelectStep3.click();
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.confirmOrderStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.confirmOrderStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.confirmOrderLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.confirmOrderLaunchDatePickerStep3);

        webElementsVendorContract.nomenclatureFileRemainsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileRemainsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileRemainsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsLaunchDatePickerStep3);

        webElementsVendorContract.nomenclatureFilePriceTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFilePriceStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFilePriceLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceLaunchDatePickerStep3);

        webElementsVendorContract.estimatedDeliveryTransferSelectStep3.click();
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.estimatedDeliveryStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.estimatedDeliveryLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryLaunchDatePickerStep3);

        webElementsVendorContract.specialConditionsTransferSelectStep3.click();
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.specialConditionsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.specialConditionsStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.specialConditionsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specialConditionsLaunchDatePickerStep3);

        webElementsVendorContract.nomenclatureFileCharacteristicsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDatePickerStep3);

        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIO.setValue("Сусликова Ольга Петровна");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPosition.setValue("бухгалтер");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmail.setValue("987654345678, test@mail.ru");

        selectEnabledDayInCalendar(webElementsVendorContract.updStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.updStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.updLaunchDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.updLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actServicesStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actServicesStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actServicesLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actServicesLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.ukdStartDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.ukdLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.additionalAgreementsStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.additionalAgreementsLaunchDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.specificationStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.specificationStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.specificationLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specificationLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.powersAttorneyStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.powersAttorneyStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.powersAttorneyLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.powersAttorneyLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actReconciliationStartDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actReconciliationLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actReportStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actReportStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actReportLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReportLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actDiscrepancyStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actDiscrepancyLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyLaunchDateUZEDOPickerStep3);

        webElementsVendorContract.step3FillingUZEDOEmloyeesFIO.setValue("Боброва Анна Викторовна");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPosition.setValue("Специалист всех специалистов");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        selectEnabledDayInCalendar(webElementsVendorContract.startEndDatePublicationMaterialsPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.startEndDatePublicationMaterialsPickerStep3);

        webElementsVendorContract.step3PublicationMaterialsEmloyeesFIO.setValue("Колобков Иван Иванович");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPosition.setValue("Специалист всех специалистов");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        webElementsVendorContract.buttonSubmitStep3.click();
        webElementsVendorContract.step4IsActiveAfterStep3.shouldBe(visible, Duration.ofMillis(10000));
        webElementsVendorContract.step4unit1.shouldHave(text("Скачать договор для подписания"));

        webElementsVendorContract.uploadContractStep4.uploadFromClasspath("1.4mb.pdf");
        webElementsVendorContract.uploadRegulationsStep4.uploadFromClasspath(("JPG.jpg"));
        webElementsVendorContract.uploadProtocolStep4.uploadFromClasspath("PNG.png");
        webElementsVendorContract.uploadTradeMarkStep4.uploadFromClasspath("PDF.pdf");
        webElementsVendorContract.uploadPowerOfAttorneyStep4.uploadFromClasspath("483kb.pdf");
        webElementsVendorContract.uploadDeclarationStep4.uploadFromClasspath("PDF.pdf");
        webElementsVendorContract.uploadExtraDocsStep4.uploadFromClasspath("PNG.png");
        webElementsVendorContract.uploadExtraDocsStep4.uploadFromClasspath("DOC.doc");

        Thread.sleep(2000);
        webElementsVendorContract.buttonSubmitStep4.click();
        webElementsVendorContract.step5IsActiveAfterFillingStep3.shouldBe(visible, Duration.ofMillis(10000));
        webElementsVendorContract.successSendingContractTitle.shouldHave(text("Договор успешно отправлен на согласование."));
        webElementsVendorContract.successSendingContractSubtitle.shouldHave(text("Мы сообщим вам статус согласования договора после его рассмотрения."));
    }

    @Test
    @Tag("")
    @DisplayName("Заполнение Шага 4 с невалидными файлами, замена их на валидные, сабмит")
    void FillingStep4WithUnvalidFilesChangingToValid() throws InterruptedException {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.FillingStep2();
        lib.ui.VendorContractPageObgect.SubmitStep2();

        selectEnabledDayInCalendar(webElementsVendorContract.imageGoodsDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.imageGoodsDatePickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.configuratorDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.configuratorDatePickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.techInfoDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.techInfoDatePickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.currentCertificatesPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.currentCertificatesPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.productDescriptionPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.productDescriptionPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.additionalImageGoodPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalImageGoodPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.videoMaterialsPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.videoMaterialsPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.modelTechInfoPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.modelTechInfoPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.constructorPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.constructorPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.productAnaloguesPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.productAnaloguesPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.similarProductsPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.similarProductsPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.characteristicsDatabasePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.characteristicsDatabasePickerStep3);

        webElementsVendorContract.step3FillingCatalogEmloyeesFIO.setValue("Кукушкина Мария Ивановна");
        webElementsVendorContract.step3FillingCatalogEmloyeesPosition.setValue("сотрудник");
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmail.setValue("89246875445, test@mail.ru");

        webElementsVendorContract.electronicArrivalTransferSelectStep3.click();
        webElementsVendorContract.electronicArrivalTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicArrivalTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);

        webElementsVendorContract.electronicOrderTransferSelectStep3.click();
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.electronicOrderStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicOrderStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.electronicOrderLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicOrderLaunchDatePickerStep3);

        webElementsVendorContract.confirmOrderTransferSelectStep3.click();
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.confirmOrderStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.confirmOrderStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.confirmOrderLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.confirmOrderLaunchDatePickerStep3);

        webElementsVendorContract.nomenclatureFileRemainsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileRemainsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileRemainsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsLaunchDatePickerStep3);

        webElementsVendorContract.nomenclatureFilePriceTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFilePriceStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFilePriceLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceLaunchDatePickerStep3);

        webElementsVendorContract.estimatedDeliveryTransferSelectStep3.click();
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.estimatedDeliveryStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.estimatedDeliveryLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryLaunchDatePickerStep3);

        webElementsVendorContract.specialConditionsTransferSelectStep3.click();
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.specialConditionsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.specialConditionsStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.specialConditionsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specialConditionsLaunchDatePickerStep3);

        webElementsVendorContract.nomenclatureFileCharacteristicsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDatePickerStep3);

        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIO.setValue("Сусликова Ольга Петровна");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPosition.setValue("бухгалтер");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmail.setValue("987654345678, test@mail.ru");

        selectEnabledDayInCalendar(webElementsVendorContract.updStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.updStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.updLaunchDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.updLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actServicesStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actServicesStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actServicesLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actServicesLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.ukdStartDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.ukdLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.additionalAgreementsStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.additionalAgreementsLaunchDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.specificationStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.specificationStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.specificationLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specificationLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.powersAttorneyStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.powersAttorneyStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.powersAttorneyLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.powersAttorneyLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actReconciliationStartDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actReconciliationLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actReportStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actReportStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actReportLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReportLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actDiscrepancyStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actDiscrepancyLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyLaunchDateUZEDOPickerStep3);

        webElementsVendorContract.step3FillingUZEDOEmloyeesFIO.setValue("Боброва Анна Викторовна");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPosition.setValue("Специалист всех специалистов");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        selectEnabledDayInCalendar(webElementsVendorContract.startEndDatePublicationMaterialsPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.startEndDatePublicationMaterialsPickerStep3);

        webElementsVendorContract.step3PublicationMaterialsEmloyeesFIO.setValue("Колобков Иван Иванович");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPosition.setValue("Специалист всех специалистов");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        webElementsVendorContract.buttonSubmitStep3.click();
        webElementsVendorContract.step4IsActiveAfterStep3.shouldBe(visible, Duration.ofMillis(10000));
        webElementsVendorContract.step4unit1.shouldHave(text("Скачать договор для подписания"));

        webElementsVendorContract.uploadContractStep4.uploadFromClasspath("DOC.doc");
        webElementsVendorContract.uploadRegulationsStep4.uploadFromClasspath(("RAR.rar"));
        webElementsVendorContract.uploadProtocolStep4.uploadFromClasspath("7Z.7z");
        webElementsVendorContract.uploadTradeMarkStep4.uploadFromClasspath("DOC.doc");
        webElementsVendorContract.uploadPowerOfAttorneyStep4.uploadFromClasspath("DOC.doc");
        webElementsVendorContract.uploadDeclarationStep4.uploadFromClasspath("RAR.rar");
        webElementsVendorContract.uploadExtraDocsStep4.uploadFromClasspath("RAR.rar");

        webElementsVendorContract.uploadContractHelpStep4.shouldHave(text("Вы пытаетесь загрузить файл с недопустимым расширением, удалите его и загрузите файлы с расширением .pdf"));
        webElementsVendorContract.uploadRegulationsHelpStep4.shouldHave(text("Вы пытаетесь загрузить файл с недопустимым расширением, удалите его и загрузите файлы с расширением .jpg, .png, .jpeg, .pdf"));
        webElementsVendorContract.uploadProtocolHelpStep4.shouldHave(text("Вы пытаетесь загрузить файл с недопустимым расширением, удалите его и загрузите файлы с расширением .jpg, .png, .jpeg, .pdf"));
        webElementsVendorContract.uploadTradeMarkHelpStep4.shouldHave(text("Вы пытаетесь загрузить файл с недопустимым расширением, удалите его и загрузите файлы с расширением .jpg, .png, .jpeg, .pdf"));
        webElementsVendorContract.uploadPowerOfAttorneyHelpStep4.shouldHave(text("Вы пытаетесь загрузить файл с недопустимым расширением, удалите его и загрузите файлы с расширением .jpg, .png, .jpeg, .pdf"));
        webElementsVendorContract.uploadDeclarationHelpStep4.shouldHave(text("Вы пытаетесь загрузить файл с недопустимым расширением, удалите его и загрузите файлы с расширением .jpg, .png, .jpeg, .pdf"));
        webElementsVendorContract.uploadExtraDocsHelpStep4.shouldHave(text("Вы пытаетесь загрузить файл с недопустимым расширением, удалите его и загрузите файлы с расширением .jpg, .png, .jpeg, .pdf, .doc, .docx"));

        Thread.sleep(2000);
        webElementsVendorContract.buttonDeleteFileContractStep4.click();
        webElementsVendorContract.uploadContractHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.uploadContractStep4.uploadFromClasspath("PDF.pdf");

        Thread.sleep(1000);
        webElementsVendorContract.buttonDeleteFileRegulationsStep4.click();
        webElementsVendorContract.uploadRegulationsHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.uploadRegulationsStep4.uploadFromClasspath("PDF.pdf");

        Thread.sleep(1000);
        webElementsVendorContract.buttonDeleteFileProtocolStep4.click();
        webElementsVendorContract.uploadProtocolHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.uploadProtocolStep4.uploadFromClasspath("PDF.pdf");

        Thread.sleep(1000);
        webElementsVendorContract.buttonDeleteFileTradeMarkStep4.click();
        webElementsVendorContract.uploadTradeMarkHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.uploadTradeMarkStep4.uploadFromClasspath("PDF.pdf");

        Thread.sleep(1000);
        webElementsVendorContract.uploadContractHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadRegulationsHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadProtocolHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadTradeMarkHelpStep4.shouldNot(exist);

        webElementsVendorContract.buttonDeleteFilePowerOfAttorneyStep4.click();
        webElementsVendorContract.uploadPowerOfAttorneyHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadPowerOfAttorneyStep4.uploadFromClasspath("PDF.pdf");

        Thread.sleep(1000);
        webElementsVendorContract.buttonDeleteFileDeclarationStep4.click();
        webElementsVendorContract.uploadDeclarationHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadDeclarationStep4.uploadFromClasspath("PDF.pdf");

        Thread.sleep(1000);
        webElementsVendorContract.buttonDeleteFileExtraDocsStep4.click();
        webElementsVendorContract.uploadExtraDocsHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadExtraDocsStep4.uploadFromClasspath("DOC.doc");

        Thread.sleep(2000);
        webElementsVendorContract.buttonSubmitStep4.click();
        webElementsVendorContract.step5IsActiveAfterFillingStep3.shouldBe(visible, Duration.ofMillis(10000));
        webElementsVendorContract.successSendingContractTitle.shouldHave(text("Договор успешно отправлен на согласование."));
        webElementsVendorContract.successSendingContractSubtitle.shouldHave(text("Мы сообщим вам статус согласования договора после его рассмотрения."));
    }

    @Test
    @Tag("")
    @DisplayName("Заполнение и сабмит Шага 4 со сбоем загрузки файла")
    void SubmitStep4WithFailedDownloading() throws InterruptedException {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.FillingStep2();
        lib.ui.VendorContractPageObgect.SubmitStep2();

        selectEnabledDayInCalendar(webElementsVendorContract.imageGoodsDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.imageGoodsDatePickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.configuratorDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.configuratorDatePickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.techInfoDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.techInfoDatePickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.currentCertificatesPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.currentCertificatesPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.productDescriptionPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.productDescriptionPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.additionalImageGoodPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalImageGoodPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.videoMaterialsPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.videoMaterialsPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.modelTechInfoPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.modelTechInfoPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.constructorPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.constructorPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.productAnaloguesPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.productAnaloguesPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.similarProductsPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.similarProductsPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.characteristicsDatabasePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.characteristicsDatabasePickerStep3);

        webElementsVendorContract.step3FillingCatalogEmloyeesFIO.setValue("Кукушкина Мария Ивановна");
        webElementsVendorContract.step3FillingCatalogEmloyeesPosition.setValue("сотрудник");
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmail.setValue("89246875445, test@mail.ru");

        webElementsVendorContract.electronicArrivalTransferSelectStep3.click();
        webElementsVendorContract.electronicArrivalTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicArrivalTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);

        webElementsVendorContract.electronicOrderTransferSelectStep3.click();
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.electronicOrderStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicOrderStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.electronicOrderLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicOrderLaunchDatePickerStep3);

        webElementsVendorContract.confirmOrderTransferSelectStep3.click();
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.confirmOrderStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.confirmOrderStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.confirmOrderLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.confirmOrderLaunchDatePickerStep3);

        webElementsVendorContract.nomenclatureFileRemainsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileRemainsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileRemainsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsLaunchDatePickerStep3);

        webElementsVendorContract.nomenclatureFilePriceTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFilePriceStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFilePriceLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceLaunchDatePickerStep3);

        webElementsVendorContract.estimatedDeliveryTransferSelectStep3.click();
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.estimatedDeliveryStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.estimatedDeliveryLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryLaunchDatePickerStep3);

        webElementsVendorContract.specialConditionsTransferSelectStep3.click();
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.specialConditionsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.specialConditionsStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.specialConditionsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specialConditionsLaunchDatePickerStep3);

        webElementsVendorContract.nomenclatureFileCharacteristicsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDatePickerStep3);

        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIO.setValue("Сусликова Ольга Петровна");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPosition.setValue("бухгалтер");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmail.setValue("987654345678, test@mail.ru");

        selectEnabledDayInCalendar(webElementsVendorContract.updStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.updStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.updLaunchDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.updLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actServicesStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actServicesStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actServicesLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actServicesLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.ukdStartDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.ukdLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.additionalAgreementsStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.additionalAgreementsLaunchDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.specificationStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.specificationStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.specificationLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specificationLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.powersAttorneyStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.powersAttorneyStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.powersAttorneyLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.powersAttorneyLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actReconciliationStartDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actReconciliationLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actReportStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actReportStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actReportLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReportLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actDiscrepancyStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actDiscrepancyLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyLaunchDateUZEDOPickerStep3);

        webElementsVendorContract.step3FillingUZEDOEmloyeesFIO.setValue("Боброва Анна Викторовна");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPosition.setValue("Специалист всех специалистов");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        selectEnabledDayInCalendar(webElementsVendorContract.startEndDatePublicationMaterialsPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.startEndDatePublicationMaterialsPickerStep3);

        webElementsVendorContract.step3PublicationMaterialsEmloyeesFIO.setValue("Колобков Иван Иванович");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPosition.setValue("Специалист всех специалистов");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        webElementsVendorContract.buttonSubmitStep3.click();
        webElementsVendorContract.step4IsActiveAfterStep3.shouldBe(visible, Duration.ofMillis(10000));
        webElementsVendorContract.step4unit1.shouldHave(text("Скачать договор для подписания"));

        webElementsVendorContract.uploadContractStep4.uploadFromClasspath("1.4mb.pdf");
        webElementsVendorContract.uploadRegulationsStep4.uploadFromClasspath(("JPG.jpg"));
        webElementsVendorContract.uploadProtocolStep4.uploadFromClasspath("PNG.png");
        webElementsVendorContract.uploadTradeMarkStep4.uploadFromClasspath("PDF.pdf");
        webElementsVendorContract.uploadPowerOfAttorneyStep4.uploadFromClasspath("483kb.pdf");
        webElementsVendorContract.uploadDeclarationStep4.uploadFromClasspath("sample-50-MB.pdf");
        webElementsVendorContract.uploadExtraDocsStep4.uploadFromClasspath("PNG.png");
        webElementsVendorContract.uploadExtraDocsStep4.uploadFromClasspath("DOC.doc");

        Thread.sleep(3000);
        webElementsVendorContract.buttonSubmitStep4.click();
        $("[role='dialog']").shouldBe(visible, Duration.ofMillis(180000));
        $("[role='dialog']").shouldHave(text("Результаты загрузки"));
        Thread.sleep(2000);
        $(By.xpath("//div[@class='ant-modal-wrap']//button[@class='ant-modal-close']/span")).click();
        Thread.sleep(1000);
        webelements.title.shouldHave(text("Договор поставщика"));
        webElementsVendorContract.step4IsActiveAfterStep3.should(exist);
        webElementsVendorContract.buttonDeleteFileDeclarationStep4.click();
        webElementsVendorContract.uploadDeclarationStep4.uploadFromClasspath("PNG.png");

        Thread.sleep(2000);
        webElementsVendorContract.buttonSubmitStep4.click();
        webElementsVendorContract.step5IsActiveAfterFillingStep3.shouldBe(visible, Duration.ofMillis(10000));
        webElementsVendorContract.successSendingContractTitle.shouldHave(text("Договор успешно отправлен на согласование."));
        webElementsVendorContract.successSendingContractSubtitle.shouldHave(text("Мы сообщим вам статус согласования договора после его рассмотрения."));
    }

    @Test
    @Tag("")
    @DisplayName("Заполнение Шага 4 с невалидными файлами 100Mb, замена их на валидные")
    void FillingStep4WithUnvalidFiles100MbChangingToValid() throws InterruptedException {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.FillingStep2();
        lib.ui.VendorContractPageObgect.SubmitStep2();

        selectEnabledDayInCalendar(webElementsVendorContract.imageGoodsDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.imageGoodsDatePickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.configuratorDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.configuratorDatePickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.techInfoDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.techInfoDatePickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.currentCertificatesPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.currentCertificatesPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.productDescriptionPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.productDescriptionPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.additionalImageGoodPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalImageGoodPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.videoMaterialsPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.videoMaterialsPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.modelTechInfoPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.modelTechInfoPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.constructorPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.constructorPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.productAnaloguesPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.productAnaloguesPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.similarProductsPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.similarProductsPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.characteristicsDatabasePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.characteristicsDatabasePickerStep3);

        webElementsVendorContract.step3FillingCatalogEmloyeesFIO.setValue("Кукушкина Мария Ивановна");
        webElementsVendorContract.step3FillingCatalogEmloyeesPosition.setValue("сотрудник");
        webElementsVendorContract.step3FillingCatalogEmloyeesPhoneOrEmail.setValue("89246875445, test@mail.ru");

        webElementsVendorContract.electronicArrivalTransferSelectStep3.click();
        webElementsVendorContract.electronicArrivalTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicArrivalTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicArrivalStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicArrivalLaunchDatePickerStep3);

        webElementsVendorContract.electronicOrderTransferSelectStep3.click();
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.electronicOrderTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.electronicOrderStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.electronicOrderStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.electronicOrderLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.electronicOrderLaunchDatePickerStep3);

        webElementsVendorContract.confirmOrderTransferSelectStep3.click();
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.confirmOrderTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.confirmOrderStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.confirmOrderStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.confirmOrderLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.confirmOrderLaunchDatePickerStep3);

        webElementsVendorContract.nomenclatureFileRemainsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileRemainsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileRemainsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileRemainsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileRemainsLaunchDatePickerStep3);

        webElementsVendorContract.nomenclatureFilePriceTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFilePriceTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFilePriceStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFilePriceLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFilePriceLaunchDatePickerStep3);

        webElementsVendorContract.estimatedDeliveryTransferSelectStep3.click();
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.estimatedDeliveryTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.estimatedDeliveryStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.estimatedDeliveryLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.estimatedDeliveryLaunchDatePickerStep3);

        webElementsVendorContract.specialConditionsTransferSelectStep3.click();
        webElementsVendorContract.specialConditionsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.specialConditionsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.specialConditionsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.specialConditionsStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.specialConditionsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specialConditionsLaunchDatePickerStep3);

        webElementsVendorContract.nomenclatureFileCharacteristicsTransferSelectStep3.click();
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferListStep3.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorContract.nomenclatureFileCharacteristicsTransferVariantStep3.click();
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsStartDatePickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsStartDatePickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDatePickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.nomenclatureFileCharacteristicsLaunchDatePickerStep3);

        webElementsVendorContract.step3FillingEDIExchangeEmloyeesFIO.setValue("Сусликова Ольга Петровна");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPosition.setValue("бухгалтер");
        webElementsVendorContract.step3FillingEDIExchangeEmloyeesPhoneOrEmail.setValue("987654345678, test@mail.ru");

        selectEnabledDayInCalendar(webElementsVendorContract.updStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.updStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.updLaunchDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.updLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actServicesStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actServicesStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actServicesLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actServicesLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.ukdStartDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.ukdLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.ukdLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.additionalAgreementsStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.additionalAgreementsLaunchDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.additionalAgreementsLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.specificationStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.specificationStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.specificationLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.specificationLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.powersAttorneyStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.powersAttorneyStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.powersAttorneyLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.powersAttorneyLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actReconciliationStartDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actReconciliationLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReconciliationLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actReportStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actReportStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actReportLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actReportLaunchDateUZEDOPickerStep3);

        selectEnabledDayInCalendar(webElementsVendorContract.actDiscrepancyStartDateUZEDOPickerStep3);
        selectWeekAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyStartDateUZEDOPickerStep3);
        selectEnabledDayInCalendar(webElementsVendorContract.actDiscrepancyLaunchDateUZEDOPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.actDiscrepancyLaunchDateUZEDOPickerStep3);

        webElementsVendorContract.step3FillingUZEDOEmloyeesFIO.setValue("Боброва Анна Викторовна");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPosition.setValue("Специалист всех специалистов");
        webElementsVendorContract.step3FillingUZEDOEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        selectEnabledDayInCalendar(webElementsVendorContract.startEndDatePublicationMaterialsPickerStep3);
        selectMonthAfterTodayInCalendar(webElementsVendorContract.startEndDatePublicationMaterialsPickerStep3);

        webElementsVendorContract.step3PublicationMaterialsEmloyeesFIO.setValue("Колобков Иван Иванович");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPosition.setValue("Специалист всех специалистов");
        webElementsVendorContract.step3PublicationMaterialsEmloyeesPhoneOrEmail.setValue("987654345678, test_test.test@mail.ru");

        webElementsVendorContract.buttonSubmitStep3.click();
        webElementsVendorContract.step4IsActiveAfterStep3.shouldBe(visible, Duration.ofMillis(10000));
        webElementsVendorContract.step4unit1.shouldHave(text("Скачать договор для подписания"));

        webElementsVendorContract.uploadContractStep4.uploadFile(new File("C:/Users/timofeeva_ese/myjava/BigFiles/100MB.pdf"));
        webElementsVendorContract.uploadRegulationsStep4.uploadFile(new File("C:/Users/timofeeva_ese/myjava/BigFiles/100MB.pdf"));
        webElementsVendorContract.uploadProtocolStep4.uploadFile(new File("C:/Users/timofeeva_ese/myjava/BigFiles/100MB.pdf"));
        webElementsVendorContract.uploadTradeMarkStep4.uploadFile(new File("C:/Users/timofeeva_ese/myjava/BigFiles/100MB.pdf"));
        webElementsVendorContract.uploadPowerOfAttorneyStep4.uploadFile(new File("C:/Users/timofeeva_ese/myjava/BigFiles/100MB.pdf"));
        webElementsVendorContract.uploadDeclarationStep4.uploadFile(new File("C:/Users/timofeeva_ese/myjava/BigFiles/100MB.pdf"));
        webElementsVendorContract.uploadExtraDocsStep4.uploadFile(new File("C:/Users/timofeeva_ese/myjava/BigFiles/100MB.pdf"));

        webElementsVendorContract.uploadContractHelpStep4.shouldHave(text("Максимальный размер файла превышен, удалите его и загрузите файл размером не более 100 Мб"));
        webElementsVendorContract.uploadRegulationsHelpStep4.shouldHave(text("Максимальный размер файла превышен, удалите его и загрузите файл размером не более 100 Мб"));
        webElementsVendorContract.uploadProtocolHelpStep4.shouldHave(text("Максимальный размер файла превышен, удалите его и загрузите файл размером не более 100 Мб"));
        webElementsVendorContract.uploadTradeMarkHelpStep4.shouldHave(text("Максимальный размер файла превышен, удалите его и загрузите файл размером не более 100 Мб"));
        webElementsVendorContract.uploadPowerOfAttorneyHelpStep4.shouldHave(text("Максимальный размер файла превышен, удалите его и загрузите файл размером не более 100 Мб"));
        webElementsVendorContract.uploadDeclarationHelpStep4.shouldHave(text("Максимальный размер файла превышен, удалите его и загрузите файл размером не более 100 Мб"));
        webElementsVendorContract.uploadExtraDocsHelpStep4.shouldHave(text("Максимальный размер файла превышен, удалите его и загрузите файл размером не более 100 Мб"));

        Thread.sleep(2000);
        webElementsVendorContract.buttonDeleteFileContractStep4.click();
        webElementsVendorContract.uploadContractHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.uploadContractStep4.uploadFromClasspath("PDF.pdf");

        Thread.sleep(1000);
        webElementsVendorContract.buttonDeleteFileRegulationsStep4.click();
        webElementsVendorContract.uploadRegulationsHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.uploadRegulationsStep4.uploadFromClasspath("PDF.pdf");

        Thread.sleep(1000);
        webElementsVendorContract.buttonDeleteFileProtocolStep4.click();
        webElementsVendorContract.uploadProtocolHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.uploadProtocolStep4.uploadFromClasspath("PDF.pdf");

        Thread.sleep(1000);
        webElementsVendorContract.buttonDeleteFileTradeMarkStep4.click();
        webElementsVendorContract.uploadTradeMarkHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.uploadTradeMarkStep4.uploadFromClasspath("PDF.pdf");

        Thread.sleep(1000);
        webElementsVendorContract.uploadContractHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadRegulationsHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadProtocolHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadTradeMarkHelpStep4.shouldNot(exist);

        webElementsVendorContract.buttonDeleteFilePowerOfAttorneyStep4.click();
        webElementsVendorContract.uploadPowerOfAttorneyHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadPowerOfAttorneyStep4.uploadFromClasspath("PDF.pdf");

        Thread.sleep(1000);
        webElementsVendorContract.buttonDeleteFileDeclarationStep4.click();
        webElementsVendorContract.uploadDeclarationHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadDeclarationStep4.uploadFromClasspath("PDF.pdf");

        Thread.sleep(1000);
        webElementsVendorContract.buttonDeleteFileExtraDocsStep4.click();
        webElementsVendorContract.uploadExtraDocsHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadExtraDocsStep4.uploadFromClasspath("DOC.doc");

        Thread.sleep(2000);
        webElementsVendorContract.buttonSubmitStep4.click();
        webElementsVendorContract.step5IsActiveAfterFillingStep3.shouldBe(visible, Duration.ofMillis(10000));
        webElementsVendorContract.successSendingContractTitle.shouldHave(text("Договор успешно отправлен на согласование."));
        webElementsVendorContract.successSendingContractSubtitle.shouldHave(text("Мы сообщим вам статус согласования договора после его рассмотрения."));
    }

    @Test
    @Tag("")
    @DisplayName("Переход с 0 на 4 Шаг, прикрепление невалидных файлов, замена сабмит ")
    void FillingUnvalidFilesChangingOnStep4Step0() throws InterruptedException {
        Configuration.holdBrowserOpen = true;
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
        webElementsVendorContract.step4subtitle2.should(exist);
        webElementsVendorContract.step4subtitle3.should(exist);
        webElementsVendorContract.step4subtitle4.should(exist);
        webElementsVendorContract.step4subtitle5.should(exist);
        webElementsVendorContract.step4subtitle6.should(exist);
        webElementsVendorContract.step4subtitle7.should(exist);

        webElementsVendorContract.uploadContractStep4.uploadFromClasspath("DOC.doc");
        webElementsVendorContract.uploadRegulationsStep4.uploadFromClasspath(("RAR.rar"));
        webElementsVendorContract.uploadProtocolStep4.uploadFromClasspath("7Z.7z");
        webElementsVendorContract.uploadTradeMarkStep4.uploadFromClasspath("DOC.doc");
        webElementsVendorContract.uploadPowerOfAttorneyStep4.uploadFromClasspath("DOC.doc");
        webElementsVendorContract.uploadDeclarationStep4.uploadFile(new File("C:/Users/timofeeva_ese/myjava/BigFiles/100Мб.csv"));
        webElementsVendorContract.uploadExtraDocsStep4.uploadFromClasspath("RAR.rar");

        webElementsVendorContract.uploadContractHelpStep4.shouldHave(text("Вы пытаетесь загрузить файл с недопустимым расширением, удалите его и загрузите файлы с расширением .pdf"));
        webElementsVendorContract.uploadRegulationsHelpStep4.shouldHave(text("Вы пытаетесь загрузить файл с недопустимым расширением, удалите его и загрузите файлы с расширением .jpg, .png, .jpeg, .pdf"));
        webElementsVendorContract.uploadProtocolHelpStep4.shouldHave(text("Вы пытаетесь загрузить файл с недопустимым расширением, удалите его и загрузите файлы с расширением .jpg, .png, .jpeg, .pdf"));
        webElementsVendorContract.uploadTradeMarkHelpStep4.shouldHave(text("Вы пытаетесь загрузить файл с недопустимым расширением, удалите его и загрузите файлы с расширением .jpg, .png, .jpeg, .pdf"));
        webElementsVendorContract.uploadPowerOfAttorneyHelpStep4.shouldHave(text("Вы пытаетесь загрузить файл с недопустимым расширением, удалите его и загрузите файлы с расширением .jpg, .png, .jpeg, .pdf"));
        webElementsVendorContract.uploadDeclarationHelpStep4.shouldHave(text("Вы пытаетесь загрузить файл с недопустимым расширением, удалите его и загрузите файлы с расширением .jpg, .png, .jpeg, .pdf"));
        webElementsVendorContract.uploadDeclarationHelpStep4.shouldHave(text("Максимальный размер файла превышен, удалите его и загрузите файл размером не более 100 Мб"));
        webElementsVendorContract.uploadExtraDocsHelpStep4.shouldHave(text("Вы пытаетесь загрузить файл с недопустимым расширением, удалите его и загрузите файлы с расширением .jpg, .png, .jpeg, .pdf, .doc, .docx"));

        Thread.sleep(2000);
        webElementsVendorContract.buttonDeleteFileContractStep4.click();
        webElementsVendorContract.uploadContractHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.uploadContractStep4.uploadFromClasspath("PDF.pdf");

        Thread.sleep(1000);
        webElementsVendorContract.buttonDeleteFileRegulationsStep4.click();
        webElementsVendorContract.uploadRegulationsHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.uploadRegulationsStep4.uploadFromClasspath("PDF.pdf");

        Thread.sleep(1000);
        webElementsVendorContract.buttonDeleteFileProtocolStep4.click();
        webElementsVendorContract.uploadProtocolHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.uploadProtocolStep4.uploadFromClasspath("PDF.pdf");

        Thread.sleep(1000);
        webElementsVendorContract.buttonDeleteFileTradeMarkStep4.click();
        webElementsVendorContract.uploadTradeMarkHelpStep4.shouldHave(text("Пожалуйста, загрузите обязательный документ"));
        webElementsVendorContract.uploadTradeMarkStep4.uploadFromClasspath("PDF.pdf");

        Thread.sleep(1000);
        webElementsVendorContract.uploadContractHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadRegulationsHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadProtocolHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadTradeMarkHelpStep4.shouldNot(exist);

        webElementsVendorContract.buttonDeleteFilePowerOfAttorneyStep4.click();
        webElementsVendorContract.uploadPowerOfAttorneyHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadPowerOfAttorneyStep4.uploadFromClasspath("PDF.pdf");

        Thread.sleep(1000);
        webElementsVendorContract.buttonDeleteFileDeclarationStep4.click();
        webElementsVendorContract.uploadDeclarationHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadDeclarationStep4.uploadFromClasspath("PDF.pdf");

        Thread.sleep(1000);
        webElementsVendorContract.buttonDeleteFileExtraDocsStep4.click();
        webElementsVendorContract.uploadExtraDocsHelpStep4.shouldNot(exist);
        webElementsVendorContract.uploadExtraDocsStep4.uploadFromClasspath("DOC.doc");

        Thread.sleep(2000);
        webElementsVendorContract.buttonSubmitStep4.click();
        webElementsVendorContract.step5ActiveFromFillingStep4AfterStep0.shouldBe(visible, Duration.ofMillis(10000));
        webElementsVendorContract.successSendingContractTitle.shouldHave(text("Договор успешно отправлен на согласование."));
        webElementsVendorContract.successSendingContractSubtitle.shouldHave(text("Мы сообщим вам статус согласования договора после его рассмотрения."));
    }



    static void selectMonthAfterTodayInCalendar(WebElement calendarElement){
        calendarElement.click();
        if (webElementsVendorContract.pickerCalendarMonthDateStep3.exists())
        {
            webElementsVendorContract.pickerCalendarMonthDateStep3.click();
        }
        else {webElementsVendorContract.pickerButtonNextMonth.click();
            webElementsVendorContract.pickerCalendarMonthDateStep3.click();
        }
    }

    static void selectWeekAfterTodayInCalendar(WebElement calendarElement){
        calendarElement.click();
        if (webElementsVendorContract.pickerCalendarWeekAfterTodayStep3.exists())
        {
            webElementsVendorContract.pickerCalendarWeekAfterTodayStep3.click();
        }
        else {webElementsVendorContract.pickerButtonNextMonth.click();
            webElementsVendorContract.pickerCalendarWeekAfterTodayStep3.click();
        }
    }

    static void selectEnabledDayInCalendar(WebElement calendarElement){
        calendarElement.click();
        if (webElementsVendorContract.pickerCalendarEnableStep3.exists())
        {
            webElementsVendorContract.pickerCalendarEnableStep3.shouldBe(enabled);
        }
        else {webElementsVendorContract.pickerButtonPreviousMonth.click();
            webElementsVendorContract.pickerCalendarEnableStep3.shouldBe(enabled);
        }
    }

}
