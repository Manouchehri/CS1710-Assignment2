# Input(s)

- Constant salary levels
-- BSc = 28000
-- BSc + 5 years = 34000
-- MSc = 35000
-- MSc + 5 years = 40000
-- PhD = 45000
-- PhD + 5 years = 60000
- Multiline string

# Process

- Collect user input into string until `done` is entered.
- For each line,
-- Has three lines of text been processed yet?
--- Reset counter to 0
-- Is counter at 0?
--- Extract ID
-- Is counter at 1?
--- Extract degree (ignore case)
-- Is counter at 2?
--- Extract years of experience 
---- Is years less than 5 years?
----- Compare with what applicant user has, and set salary
-- Print out results

# Output(s)

- For each applicant:
-- ID: [ID] Expected Salary: $[salary]