/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.services;

import cn.hselfweb.webpub.webpubmiddleware.proxy.DBProxy;
import cn.hselfweb.webpub.webpubmiddleware.type.CreateDbParam;
import cn.hselfweb.webpub.webpubmiddleware.type.CreateFtpParam;
import cn.hselfweb.webpub.webpubmiddleware.type.DeleteDbParam;
import cn.hselfweb.webpub.webpubmiddleware.utils.StaticData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * 数据库业务层
 */
@Service
public class DBService {
    private DBProxy dbProxy;

    @Autowired
    DBService(DBProxy dbProxy) {
        this.dbProxy = dbProxy;
    }

    public ResponseEntity<String> createDb(CreateDbParam createDbParam) {
        return this.dbProxy.createDb(createDbParam);
    }

    public ResponseEntity<String> deleteDb(DeleteDbParam deleteDbParam) {
        return this.dbProxy.deleteDb(deleteDbParam);
    }


}
