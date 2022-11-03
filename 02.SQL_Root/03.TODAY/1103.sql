-- 숫자형 데이터 컬럼을 추가
ALTER TABLE `todolist`
ADD `mynum` int;
/*
ALTER TABLE `테이블명`
ADD `컬럼명` 데이터형;
*/

-- 숫자항목 추가후 새로 데이터 추가하기
INSERT INTO `todolist`(`title`,`cont`,`mynum`)
VALUES ("금요일준비일정","금요일엔 불금,놀자!!!",10)

-- 숫자항목 추가후 새로 데이터 추가하기 하나더!
-- 숫자형 데이터에 문자데이터 입력하면?
INSERT INTO `todolist`(`title`,`cont`,`mynum`)
VALUES ("금요일준비일정","금요일엔 불금,놀자!!!","놀자")
-- 1열이 입력됨!
-- 경고창 메시지:
-- Warning: #1366 Incorrect integer value: '놀자' for column `today1103`.`todolist`.`mynum` at row 1
-- 결과해석: 문자형이 숫잘형에 못들어가므로 대체하여 숫자형의
-- 기본데이터인 0을 넣어준다! 