--
--    Copyright 2010-2016 the original author or authors.
--
--    Licensed under the Apache License, Version 2.0 (the "License");
--    you may not use this file except in compliance with the License.
--    You may obtain a copy of the License at
--
--       http://www.apache.org/licenses/LICENSE-2.0
--
--    Unless required by applicable law or agreed to in writing, software
--    distributed under the License is distributed on an "AS IS" BASIS,
--    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
--    See the License for the specific language governing permissions and
--    limitations under the License.
--

-- // create table customer_profile
-- Migration SQL that makes the change goes here.
create table customer_profile (
  customer_profile_id  SERIAL not null primary key,
  email varchar(50) not null,
  first_name varchar(80) not null,
  last_name varchar(100) not null

);

-- //@UNDO
-- SQL to undo the change goes here.
drop table if exists customer_profile;

