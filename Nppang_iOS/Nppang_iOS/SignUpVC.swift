//
//  SignUpVC.swift
//  Nppang_iOS
//
//  Created by 권태우 on 2022/07/28.
//

import UIKit
import GoogleSignIn

class SignUpVC: UIViewController {
    
    override func viewDidLoad() {
        super.viewDidLoad()
    }
    
    override func viewWillAppear(_ animated: Bool) {
        navigationItem.hidesBackButton = true
    }
    
    @IBAction func btnSignUp(_ sender: UIButton) {
        self.navigationController?.popViewController(animated: true)
    }
}