package com.cg.wallet.repository;

import com.cg.wallet.bean.Customer;

public interface IWalletRepository {
  public boolean save(Customer customer);
  Customer findByPhone(String phone);
}
