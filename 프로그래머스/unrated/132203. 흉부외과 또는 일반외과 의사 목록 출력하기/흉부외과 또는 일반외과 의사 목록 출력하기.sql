-- 코드를 입력하세요
SELECT dr_name, dr_id, mcdp_cd, to_char(hire_ymd, 'yyyY-mM-dD') AS HIRE_YMD
from doctor
where mcdp_cd in ('CS', 'GS')
order by hire_ymd desc, DR_NAME 