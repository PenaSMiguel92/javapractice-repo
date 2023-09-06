CREATE TABLE site_user (
	user_id SERIAL PRIMARY KEY,
	username VARCHAR(255) UNIQUE,
	email VARCHAR(200) UNIQUE,
	pass BIGINT NOT NULL
);

CREATE TABLE moodlet (
	moodlet_id SERIAL PRIMARY KEY,
	user_id_fk BIGINT REFERENCES site_user(user_id),
	sleep_value DECIMAL CHECK(sleep_value >= 0 AND sleep_value <= 100),
	comfort_value DECIMAL CHECK(comfort_value >= 0 AND comfort_value <= 100),
	fun_value DECIMAL CHECK(fun_value >= 0 AND fun_value <= 100),
	hunger_value DECIMAL CHECK(hunger_value >= 0 AND hunger_value <= 100),
	social_value DECIMAL CHECK(social_value >= 0 AND social_value <= 100),
	toilet_value DECIMAL CHECK(toilet_value >= 0 AND toilet_value <= 100),
	hygiene_value DECIMAL CHECK(hygiene_value >= 0 AND hygiene_value <= 100)
);

ALTER TABLE site_user ADD COLUMN moodlet_id_fk BIGINT REFERENCES moodlet(moodlet_id);
ALTER TABLE site_user ADD COLUMN family_id_fk BIGINT REFERENCES user_family(family_id);
ALTER TABLE site_user DROP COLUMN username;
ALTER TABLE site_user ADD COLUMN 
DROP TABLE site_user CASCADE;
DROP TABLE moodlet CASCADE;
DROP TABLE user_family CASCADE;

SELECT * FROM site_user;

CREATE TABLE user_family (
	family_id SERIAL PRIMARY KEY,
	primary_user_id_fk BIGINT REFERENCES site_user(user_id),
	member_1_fk BIGINT REFERENCES site_user(user_id),
	member_2_fk BIGINT REFERENCES site_user(user_id),
	member_3_fk BIGINT REFERENCES site_user(user_id)
);