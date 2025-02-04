package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	//名前のエラーメッセージ
    @NotBlank(message = "名前を入力してください")
    @Size(max = 100, message = "名前は100文字以内で入力してください")
    private String name;

    //メアドのエラーメッセージ
    @NotBlank(message = "メールアドレスを入力してください")
    @Email(message = "メールアドレスの形式が不正です")
    private String mailAddress;

    //パスワードのエラーメッセージ
    @NotBlank(message = "パスワードを入力してください")
    @Pattern(
        regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,20}$",
        message = "パスワードは8〜20文字で、英大文字・小文字・数字を各1文字以上含めてください"
    )
    private String password;

    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMailAddress() { return mailAddress; }
    public void setMailAddress(String mailAddress) { this.mailAddress = mailAddress; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password + "]";
    }

}
