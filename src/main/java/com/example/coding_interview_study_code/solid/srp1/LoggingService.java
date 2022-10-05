package com.example.coding_interview_study_code.solid.srp1;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LoggingService {

/*
    private DataSource savedLogging = new MySQLDataSource();  // LoggingService 클래스는 loggingDB 인스턴스를 생성하는 역할 + 로그 출력 및 저장하는 비지니스 로직을 갖는 역할

    로그 저장 및 츨력하는 비지니스 로직
    ....

    private DataSource loggingDB = new OracleDataSource();

    로그 저장 및 츨력하는 비지니스 로직
    ....
 */


    private final DataSource dataSource;

    // 로그 저장 및 츨력하는 비지니스 로직
    // ....

}
