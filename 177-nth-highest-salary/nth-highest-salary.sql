CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    declare M INT;
    SET M=N-1;
  RETURN (
      # Write your MySQL query statement below.
        SELECT  distinct salary FROM Employee
        order by salary DESC 
        LIMIT 1 OFFSET M
  );
END