package app.compensar.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Registro {


    public final static Target BTN_REGISTRARSE = Target.the("the username field")
            .located(By.id("com.exito.appcompania:id/AppCompatButton_registrarse"));



    public final static Target TXT_NOMBRE = Target.the("the username field")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText"));
    public final static Target TXT_APELLIDO = Target.the("the username field")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText"));

    public final static Target TXT_CEDULA = Target.the("the username field")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText"));

    public final static Target SELECT_ANO = Target.the("the username field")
            .located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_anio_registro"));

    public final static Target SELECT_MES = Target.the("the username field")
            .located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_mes_registro"));

    public final static Target SELECT_DIA = Target.the("the username field")
            .located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_dia_registro"));
    public final static Target CELULAR = Target.the("the username field")
            .located(By.id("com.exito.appcompania:id/TextInputEditText_tel"));
    public final static Target CORREO = Target.the("the username field")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[7]/android.widget.FrameLayout/android.widget.EditText"));
    public final static Target CBX_ACEPTOC = Target.the("the username field")
            .located(By.id("com.exito.appcompania:id/AppCompatTextView_terminos_y_condiciones"));
    public final static Target CBX_ACEPTOP = Target.the("the username field")
            .located(By.id("com.exito.appcompania:id/AppCompatTextView_politicas_tratamiento"));
    public final static Target BTN_CONFIRMAR = Target.the("the username field")
            .located(By.id("com.exito.appcompania:id/AppCompatButton_registrar"));

    public final static Target CODIGO_VERIFICACION = Target.the("the username field")
            .located(By.id("com.exito.appcompania:id/PinView_code_otp"));

    public final static Target CONTRASEÑA = Target.the("the username field")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText"));

    public final static Target CONFIRMAR_CONTRASEÑA = Target.the("the username field")
            .located(By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText"));

    public final static Target BTN_CREAR = Target.the("the username field")
            .located(By.id("com.exito.appcompania:id/AppCompatButton_continuar"));
    public final static Target BTN_MICUENTA = Target.the("the username field")
            .located(By.id("//android.widget.FrameLayout[@content-desc='Mi cuenta']/android.widget.FrameLayout/android.widget.ImageView"));
    public final static Target LBL_NOMBRE = Target.the("the username field")
            .located(By.id("com.exito.appcompania:id/AppCompatTextView_hola"));



}
